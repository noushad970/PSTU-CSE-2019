import random
import math
import matplotlib.pyplot as plt

lam = float(input("Enter lambda: "))
n = int(input("Enter number of random variates: "))

samples = []

for i in range(n):

    u = random.random()

    x = -math.log(1 - u) / lam

    samples.append(x)

print("\nGenerated Random Variates:\n")

for value in samples:
    print(round(value, 4))

plt.hist(samples, bins=20)

plt.title("Exponential Distribution using Inverse Transform")
plt.xlabel("Random Variate")
plt.ylabel("Frequency")

plt.show()