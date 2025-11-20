# unreliable_channel.py
import socket
import threading
import random
import time
import argparse

# Channel parameters
parser = argparse.ArgumentParser()
parser.add_argument("--sender_addr", default="127.0.0.1")
parser.add_argument("--sender_port", type=int, default=12000)
parser.add_argument("--receiver_addr", default="127.0.0.1")
parser.add_argument("--receiver_port", type=int, default=13000)
parser.add_argument("--channel_port", type=int, default=14000)
parser.add_argument("--drop_prob", type=float, default=0.1)
parser.add_argument("--corrupt_prob", type=float, default=0.1)
parser.add_argument("--delay_prob", type=float, default=0.1)
parser.add_argument("--max_delay", type=float, default=1.0)
args = parser.parse_args()

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock.bind(("0.0.0.0", args.channel_port))

print(f"[CHANNEL] Listening on port {args.channel_port}")

def corrupt_packet(data: bytes):
    """Randomly corrupt a byte inside the packet."""
    if random.random() < args.corrupt_prob and len(data) > 4:
        idx = random.randint(4, len(data) - 1)
        corrupted = data[:idx] + bytes([data[idx] ^ 0xFF]) + data[idx+1:]
        print("[CHANNEL] CORRUPTING PACKET")
        return corrupted
    return data

def forward(data: bytes, source):
    """Forward packet either sender→receiver or receiver→sender with loss/corruption/delay."""
    # Where is the packet from?
    if source[1] == args.sender_port:
        dest = (args.receiver_addr, args.receiver_port)
        direction = "SENDER → RECEIVER"
    else:
        dest = (args.sender_addr, args.sender_port)
        direction = "RECEIVER → SENDER"

    # DROP
    if random.random() < args.drop_prob:
        print(f"[CHANNEL] DROPPED ({direction})")
        return

    # DELAY
    if random.random() < args.delay_prob:
        d = random.uniform(0, args.max_delay)
        print(f"[CHANNEL] DELAYING {d:.3f}s ({direction})")
        time.sleep(d)

    # CORRUPT
    data = corrupt_packet(data)

    sock.sendto(data, dest)
    print(f"[CHANNEL] FORWARDED ({direction})")

# Main loop
while True:
    data, addr = sock.recvfrom(4096)
    threading.Thread(target=forward, args=(data, addr), daemon=True).start()
