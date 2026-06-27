import numpy as np
import matplotlib.pyplot as plt
import scipy.stats as stats

data = np.array([
    2.3, 3.1, 4.0, 2.8, 3.5,
    4.2, 5.1, 3.8, 4.4, 3.0,
    2.7, 3.9, 4.6, 5.0, 3.4
])

mu, sigma = stats.norm.fit(data)

print("Normal Distribution Parameters")
print("Mean =", mu)
print("Standard Deviation =", sigma)

stats.probplot(data, dist="norm", plot=plt)

plt.title("Q-Q Plot (Normal Distribution)")
plt.grid(True)

plt.show()

data = np.array([
    2.3, 3.1, 4.0, 2.8, 3.5,
    4.2, 5.1, 3.8, 4.4, 3.0,
    2.7, 3.9, 4.6, 5.0, 3.4
])

shape, loc, scale = stats.weibull_min.fit(data)

print("Weibull Parameters")
print("Shape =", shape)
print("Scale =", scale)

stats.probplot(
    data,
    dist=stats.weibull_min(shape, loc, scale),
    plot=plt
)

plt.title("Q-Q Plot (Weibull Distribution)")
plt.grid(True)

plt.show()


data = np.array([
    2.3, 3.1, 4.0, 2.8, 3.5,
    4.2, 5.1, 3.8, 4.4, 3.0,
    2.7, 3.9, 4.6, 5.0, 3.4
])

shape, loc, scale = stats.lognorm.fit(data)

print("Lognormal Parameters")
print("Shape =", shape)
print("Scale =", scale)

stats.probplot(
    np.log(data),
    dist="norm",
    plot=plt
)

plt.title("Q-Q Plot (Lognormal Distribution)")
plt.grid(True)

plt.show()