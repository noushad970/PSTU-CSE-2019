import numpy as np
import matplotlib.pyplot as plt
from scipy.stats import norm

x = np.linspace(0, 200, 1000)

y1 = norm.pdf(x, 100, 20)

plt.figure(figsize=(8,5))
plt.plot(x, y1)

plt.title("Unimodal Normal Distribution")
plt.xlabel("X")
plt.ylabel("Density")

plt.grid(True)
plt.show()


y2 = (
    0.5 * norm.pdf(x, 70, 10)
    +
    0.5 * norm.pdf(x, 130, 10)
)

plt.figure(figsize=(8,5))
plt.plot(x, y2)

plt.title("Multimodal Distribution")
plt.xlabel("X")
plt.ylabel("Density")

plt.grid(True)
plt.show()