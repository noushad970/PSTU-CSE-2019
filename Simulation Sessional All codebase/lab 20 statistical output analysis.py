import numpy as np
from scipy.stats import t
import math

data = [3.2, 4.3, 5.1, 4.2, 4.6]

n = len(data)

mean = np.mean(data)
variance = np.var(data, ddof=1)
std = math.sqrt(variance)

standard_error = std / math.sqrt(n)

t_value = t.ppf(0.975, n - 1)

margin = t_value * standard_error

lower = mean - margin
upper = mean + margin

desired_half_width = 0.5

required_runs = math.ceil(
    (t_value * std / desired_half_width) ** 2
)

print("Sample Mean =", round(mean, 3))
print("Sample Variance =", round(variance, 3))
print("Standard Error =", round(standard_error, 3))

print("\n95% Confidence Interval:")
print("(", round(lower, 3), ",", round(upper, 3), ")")

print("\nRequired Replications =", required_runs)