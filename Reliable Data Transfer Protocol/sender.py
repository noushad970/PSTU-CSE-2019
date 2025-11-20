# sender.py
import socket
import argparse
import threading
import time
from common import make_packet, parse_packet, TYPE_DATA, TYPE_ACK

parser = argparse.ArgumentParser()
parser.add_argument("--channel_addr", default="127.0.0.1")
parser.add_argument("--channel_port", type=int, default=14000)
parser.add_argument("--listen_port", type=int, default=12000)
parser.add_argument("--timeout", type=float, default=1.0)
args = parser.parse_args()

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(("0.0.0.0", args.listen_port))
sock.settimeout(0.1)

current_seq = 0
waiting_ack = threading.Event()
ack_received_for = -1
last_packet = None
timer = None
lock = threading.Lock()
messages = [
    
]
while True:
    x=input("Enter message to send (or 'exit' to quit): ")
    if x.strip():
        messages.append(x.strip())
    if x.lower()=='exit':
        break


def timeout_handler():
    global last_packet
    print("[SENDER] TIMEOUT → Retransmitting packet")
    with lock:
        sock.sendto(last_packet, (args.channel_addr, args.channel_port))
    start_timer()

def start_timer():
    global timer
    if timer:
        timer.cancel()
    timer = threading.Timer(args.timeout, timeout_handler)
    timer.daemon = True
    timer.start()

def listen_for_acks():
    global ack_received_for
    while True:
        try:
            data, addr = sock.recvfrom(4096)
        except socket.timeout:
            continue

        pkt = parse_packet(data)

        if pkt is None or not pkt["valid"]:
            print("[SENDER] Received corrupted ACK")
            continue

        if pkt["type"] != TYPE_ACK:
            continue

        print(f"[SENDER] Received ACK {pkt['seq']}")

        if pkt["seq"] == current_seq:
            ack_received_for = pkt["seq"]
            waiting_ack.set()

threading.Thread(target=listen_for_acks, daemon=True).start()

for msg in messages:
    print(f"\n[SENDER] Sending message: {msg}")
    pkt = make_packet(TYPE_DATA, current_seq, msg)
    last_packet = pkt

    # Send
    with lock:
        sock.sendto(pkt, (args.channel_addr, args.channel_port))

    waiting_ack.clear()
    start_timer()

    # Wait for ACK
    waiting_ack.wait()
    timer.cancel()

    print(f"[SENDER] ACK {current_seq} received → Proceeding")
    current_seq = 1 - current_seq

print("\n[SENDER] All messages successfully sent!")
