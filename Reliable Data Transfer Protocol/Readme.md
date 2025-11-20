# Reliable Data Transfer (RDT) Protocol – Stop-and-Wait ARQ
### Course: CCE 314 – Data Communication  
### Student: Md Noushad  
### Language: Python  
### Files Included:
- sender.py  
- receiver.py  
- unreliable_channel.py  
- common.py  
- README.md  
- report.pdf (or report.md)

---

## 📌 Project Overview
This project implements the **Reliable Data Transfer (RDT)** protocol using the **Stop-and-Wait ARQ** technique over **UDP sockets**.

Because UDP provides:
No guarantee of delivery  
No guarantee of order  
No guarantee of correctness  

We build reliability manually using:
- sequence numbers  
- acknowledgments (ACK)  
- checksum  
- timeout & retransmission  
- duplicate ACK handling

A middle program called **unreliable_channel.py** simulates:
- packet loss  
- packet corruption  
- packet delay  

So the project behaves like real-world Internet communication.

---

## 📁 Project Structure

