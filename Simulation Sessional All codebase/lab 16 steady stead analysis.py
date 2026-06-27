import random
import numpy as np
import matplotlib.pyplot as plt

simulation_time = 200
warmup_period = 50

production_times = []

for i in range(simulation_time):
    value = random.uniform(8, 12)
    production_times.append(value)

steady_state_data = production_times[warmup_period:]

steady_mean = np.mean(steady_state_data)

print("Warm-up Period:", warmup_period)
print("Steady-State Mean:", round(steady_mean, 2))

print("\nSteady-State Values:\n")
print(*[round(x, 2) for x in steady_state_data], sep=", ")

plt.figure(figsize=(8, 5))

plt.plot(production_times)

plt.axvline(
    warmup_period,
    linestyle='--',
    label='Warm-up End'
)

plt.xlabel("Time")
plt.ylabel("Production Rate")
plt.title("Steady-State Analysis")
plt.legend()

plt.show()