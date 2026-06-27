import random
import math
import numpy as np
import matplotlib.pyplot as plt

lam = 1
n = 5000

samples = []

for i in range(n):
    u = random.random()
    x = -math.log(1 - u) / lam
    samples.append(round(x, 4))

print("Generated Random Numbers:\n")
print(*samples, sep=", ")

x_values = np.linspace(0, max(samples), 1000)
pdf = lam * np.exp(-lam * x_values)

plt.figure(figsize=(8, 5))

plt.hist(samples, bins=50, density=True, alpha=0.7,
         label="Generated Data")

plt.plot(x_values, pdf,
         linewidth=2,
         label="Theoretical PDF")

plt.xlabel("X")
plt.ylabel("Density")
plt.title("Exponential Distribution using Inverse Transform Method")
plt.legend()

plt.show()