# common.py
import struct

# Packet types
TYPE_DATA = 0
TYPE_ACK = 1

def checksum_bytes(b: bytes) -> int:
    """Compute simple 16-bit checksum."""
    return sum(b) & 0xFFFF

def make_packet(pkt_type: int, seq: int, payload: bytes = b''):
    """Create a DATA or ACK packet with checksum."""
    if isinstance(payload, str):
        payload = payload.encode()

    # Create header with checksum = 0 temporarily
    header = struct.pack("!BBH", pkt_type, seq, 0)

    # Compute checksum over header + payload
    ch = checksum_bytes(header + payload)

    # Repack header with real checksum
    header = struct.pack("!BBH", pkt_type, seq, ch)

    # Final packet = header + payload
    return header + payload

def parse_packet(packet_bytes: bytes):
    """Extract fields and verify checksum."""
    if len(packet_bytes) < 4:
        return None

    pkt_type, seq, ch = struct.unpack("!BBH", packet_bytes[:4])
    payload = packet_bytes[4:]

    # Recompute checksum
    header_zero = struct.pack("!BBH", pkt_type, seq, 0)
    calc = checksum_bytes(header_zero + payload)
    valid = (calc == ch)

    return {
        'type': pkt_type,
        'seq': seq,
        'checksum': ch,
        'payload': payload,
        'valid': valid
    }
