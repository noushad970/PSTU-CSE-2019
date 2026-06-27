import numpy as np
import matplotlib.pyplot as plt

mean = 100
std = 20

sample = np.random.normal(mean, std, 200)

print("Sample Mean =", np.mean(sample))
print("Sample Standard Deviation =", np.std(sample))

plt.figure(figsize=(8,5))

plt.hist(sample, bins=15)

plt.title("Normal Distribution (μ=100, σ=20, n=200)")
plt.xlabel("Value")
plt.ylabel("Frequency")

plt.show()