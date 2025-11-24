# receiver_web.py
import socket
import threading
import argparse
import json
import time
from http.server import BaseHTTPRequestHandler, HTTPServer
from common import parse_packet, make_packet, TYPE_ACK, TYPE_DATA

parser = argparse.ArgumentParser()
parser.add_argument("--listen_port", type=int, default=13000)  # UDP
parser.add_argument("--channel_addr", default="127.0.0.1")
parser.add_argument("--channel_port", type=int, default=14000)
parser.add_argument("--http_port", type=int, default=8000)     # Web UI + SSE
args = parser.parse_args()

udp_sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
udp_sock.bind(("0.0.0.0", args.listen_port))

print(f"[RECEIVER] UDP listening on port {args.listen_port}")

# SSE client list (each entry is an object with a 'wfile' stream)
clients_lock = threading.Lock()
clients = []

def broadcast_event(message):
    """Send 'message' (string) as an SSE event to all connected clients."""
    payload = f"data: {json.dumps(message)}\n\n".encode('utf-8')
    remove = []
    with clients_lock:
        for c in clients:
            try:
                c.wfile.write(payload)
                c.wfile.flush()
            except Exception:
                # client disconnected or broken pipe -> mark for removal
                remove.append(c)
        for r in remove:
            try:
                clients.remove(r)
            except Exception:
                pass

def send_ack(seq):
    pkt = make_packet(TYPE_ACK, seq)
    # send ACK back to channel (so it forwards to sender)
    udp_sock.sendto(pkt, (args.channel_addr, args.channel_port))
    print(f"[RECEIVER] Sent ACK {seq}")

def udp_listener():
    expected_seq = 0
    while True:
        data, _ = udp_sock.recvfrom(4096)
        pkt = parse_packet(data)
        if pkt is None:
            print("[RECEIVER] Malformed packet")
            continue
        if not pkt['valid']:
            print("[RECEIVER] CORRUPTED packet -> send duplicate ACK for last good")
            send_ack(1 - expected_seq)
            continue
        if pkt['type'] != TYPE_DATA:
            continue
        seq = pkt['seq']
        text = pkt['payload'].decode(errors='ignore')
        if seq == expected_seq:
            print(f"[RECEIVER] Delivered seq {seq}: {text}")
            # notify web clients
            broadcast_event({"seq": seq, "payload": text, "time": time.time()})
            send_ack(seq)
            expected_seq = 1 - expected_seq
        else:
            print("[RECEIVER] Duplicate packet -> resend ACK")
            send_ack(1 - expected_seq)

# HTTP handler: serves index.html at / and SSE at /events
INDEX_HTML = r"""<!doctype html>
<html>
<head>
  <meta charset="utf-8">
  <title>RDT Receiver UI</title>
  <style>
    body{font-family:system-ui,Segoe UI,Arial;background:#071024;color:#e6eef8;padding:18px}
    .box{background:#071a2a;padding:12px;border-radius:8px;max-width:900px}
    h1{margin:0 0 8px}
    #events{margin-top:12px;font-family:monospace}
    .item{padding:8px;border-bottom:1px solid rgba(255,255,255,0.02)}
    .meta{font-size:12px;color:#94a3b8}
    #sendForm{margin-top:14px;display:flex;gap:8px}
    input{padding:8px;border-radius:8px;border:1px solid rgba(255,255,255,0.06);flex:1}
    button{padding:8px;border-radius:8px;background:#06b6d4;border:none;color:#00121a;font-weight:700}
    a{color:#06b6d4}
  </style>
</head>
<body>
  <div class="box">
    <h1>RDT Receiver — Live Delivered Messages</h1>
    <div style="font-size:13px;color:#94a3b8">Messages delivered by receiver are streamed here (SSE). Use the form below to send a message via the Sender (HTTP POST).</div>
    <div id="events"></div>

    <form id="sendForm">
      <input id="msg" placeholder="Message to send (goes to sender)"></input>
      <button type="button" id="sendBtn">Send</button>
    </form>

    <p style="margin-top:12px"><a href="/mnt/data/Assignment for CCE 314.pdf" target="_blank">Open Assignment PDF</a></p>
  </div>

  <script>
    const eventsEl = document.getElementById('events');
    const evtSource = new EventSource('/events');

    evtSource.onmessage = function(e) {
      try {
        const obj = JSON.parse(e.data);
        const d = new Date(obj.time*1000);
        const el = document.createElement('div');
        el.className = 'item';
        el.innerHTML = '<div><strong>seq ' + obj.seq + '</strong> — ' + obj.payload + '</div><div class="meta">' + d.toLocaleTimeString() + '</div>';
        eventsEl.prepend(el);
      } catch(err){ console.error(err) }
    };

    document.getElementById('sendBtn').addEventListener('click', async ()=>{
      const msg = document.getElementById('msg').value || 'Hello from web';
      try {
        const res = await fetch('http://localhost:8001/send', {
          method:'POST',
          headers:{'Content-Type':'application/json'},
          body: JSON.stringify({message: msg})
        });
        const j = await res.json();
        if(j.ok) { alert('Sent to sender'); document.getElementById('msg').value=''; }
        else alert('Send failed: ' + JSON.stringify(j));
      } catch(e){ alert('Error: '+e) }
    });
  </script>
</body>
</html>
"""

class MyHandler(BaseHTTPRequestHandler):
    def do_GET(self):
        if self.path == "/":
            self.send_response(200)
            self.send_header("Content-Type","text/html; charset=utf-8")
            self.end_headers()
            self.wfile.write(INDEX_HTML.encode('utf-8'))
            return
        if self.path == "/events":
            # SSE endpoint
            self.send_response(200)
            self.send_header("Content-Type", "text/event-stream")
            self.send_header("Cache-Control", "no-cache")
            self.send_header("Connection", "keep-alive")
            # CORS
            self.send_header("Access-Control-Allow-Origin", "*")
            self.end_headers()
            # add to clients list
            with clients_lock:
                clients.append(self)
                print(f"[SSE] Client connected (total = {len(clients)})")
            try:
                # keep the request open
                while True:
                    # just sleep; actual events are pushed by broadcast_event
                    time.sleep(0.5)
            except Exception:
                # client disconnected; the broadcaster will also remove broken clients
                pass
            finally:
                with clients_lock:
                    if self in clients:
                        clients.remove(self)
                        print(f"[SSE] Client disconnected (total = {len(clients)})")
            return
        # not found
        self.send_response(404)
        self.end_headers()

    def log_message(self, format, *args):
        # silence default http logging
        return

def run_http():
    server = HTTPServer(("0.0.0.0", args.http_port), MyHandler)
    print(f"[RECEIVER-HTTP] Serving UI & SSE at http://0.0.0.0:{args.http_port}/")
    server.serve_forever()

if __name__ == "__main__":
    threading.Thread(target=udp_listener, daemon=True).start()
    threading.Thread(target=run_http, daemon=True).start()
    print("[RECEIVER] Running. Press Ctrl+C to stop.")
    try:
        while True:
            threading.Event().wait(1)
    except KeyboardInterrupt:
        print("Exiting receiver.")
