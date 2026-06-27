import random
import numpy as np
import math

replications = 30

waiting_times = []

for i in range(replications):

    avg_wait = random.uniform(4, 8)

    waiting_times.append(avg_wait)

mean = np.mean(waiting_times)

std = np.std(waiting_times, ddof=1)

margin = 1.96 * (std / math.sqrt(replications))

lower = mean - margin
upper = mean + margin

print("Average Waiting Time =", round(mean, 2))

print("95% Confidence Interval:")
print("(", round(lower, 2), ",", round(upper, 2), ")")

import matplotlib.pyplot as plt

plt.figure(figsize=(8, 4))

plt.errorbar(
    mean,
    0,
    xerr=margin,
    fmt='o',
    capsize=10
)

plt.yticks([])

plt.xlabel("Average Waiting Time")

plt.title("95% Confidence Interval")

plt.show()