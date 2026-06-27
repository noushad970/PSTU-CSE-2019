import math
import numpy as np
import matplotlib.pyplot as plt

mean_days = 100
lam = 1 / mean_days

probability = math.exp(-lam * 120)

print("Rate (λ) =", lam)
print("P(X > 120) =", probability)

x = np.linspace(0, 500, 1000)

rates = [0.5, 1.0, 2.0, 4.0]

for r in rates:

    y = r * np.exp(-r * x)

    plt.figure(figsize=(8,5))

    plt.plot(x, y)

    plt.title(f"Exponential Distribution (λ = {r})")
    plt.xlabel("x")
    plt.ylabel("Density")

    plt.grid(True)

    plt.show()