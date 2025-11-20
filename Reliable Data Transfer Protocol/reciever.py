# receiver.py
import socket
import argparse
from common import parse_packet, make_packet, TYPE_DATA, TYPE_ACK

parser = argparse.ArgumentParser()
parser.add_argument("--listen_port", type=int, default=13000)
parser.add_argument("--channel_addr", default="127.0.0.1")
parser.add_argument("--channel_port", type=int, default=14000)
args = parser.parse_args()

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(("0.0.0.0", args.listen_port))

print(f"[RECEIVER] Listening on port {args.listen_port}")

expected_seq = 0

def send_ack(seq):
    ack_packet = make_packet(TYPE_ACK, seq)
    sock.sendto(ack_packet, (args.channel_addr, args.channel_port))
    print(f"[RECEIVER] Sent ACK {seq}")

while True:
    data, addr = sock.recvfrom(4096)
    pkt = parse_packet(data)

    if pkt is None:
        print("[RECEIVER] Received malformed packet")
        continue

    if not pkt["valid"]:
        print("[RECEIVER] CORRUPTED packet → sending duplicate ACK")
        send_ack(1 - expected_seq)
        continue

    if pkt["type"] != TYPE_DATA:
        continue

    seq = pkt["seq"]
    payload = pkt["payload"].decode()

    # Correct packet
    if seq == expected_seq:
        print(f"[RECEIVER] Received correct DATA seq={seq} → Delivering: {payload}")
        send_ack(seq)
        expected_seq = 1 - expected_seq  # flip seq
    else:
        # Duplicate packet
        print("[RECEIVER] Duplicate packet → resending ACK")
        send_ack(1 - expected_seq)
