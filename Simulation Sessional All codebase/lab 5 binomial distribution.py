import math
import matplotlib.pyplot as plt

n = 15
p = 0.90
q = 1 - p
x = 13

probability = math.comb(n, x) * (p ** x) * (q ** (n - x))

mean = n * p
variance = n * p * q

data = [14, 13, 15, 12, 14]
sample_mean = sum(data) / len(data)

print("Network Packet Delivery (Binomial Distribution)\n")

print("n =", n)
print("p =", p)
print("q =", q)

print("\nP(X=13) =", probability)
print("Mean =", mean)
print("Variance =", variance)
print("Sample Mean =", sample_mean)

plt.figure(figsize=(8, 5))

batches = ["Batch 1", "Batch 2", "Batch 3", "Batch 4", "Batch 5"]

plt.bar(batches, data)

plt.axhline(
    y=mean,
    linestyle='--',
    label=f'Theoretical Mean = {mean}'
)

plt.xlabel("Batches")
plt.ylabel("Successful Packets")
plt.title("Network Packet Delivery Simulation")

plt.legend()
plt.show()