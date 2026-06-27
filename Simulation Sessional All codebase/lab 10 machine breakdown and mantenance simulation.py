import numpy as np

num_machines = 5
simulation_days = 30

mean_breakdown_time = 10

weibull_shape = 2
weibull_scale = 3

total_downtime = 0
total_production = 0

for machine in range(num_machines):

    current_time = 0
    downtime = 0

    while current_time < simulation_days:

        working_time = np.random.exponential(mean_breakdown_time)
        current_time += working_time

        if current_time >= simulation_days:
            break

        repair_time = np.random.weibull(weibull_shape) * weibull_scale

        downtime += repair_time
        current_time += repair_time

    production = simulation_days - downtime

    total_downtime += downtime
    total_production += production

    print(f"Machine {machine+1}")
    print(f"Downtime = {downtime:.2f} days")
    print(f"Production Time = {production:.2f} days\n")

print("Total Downtime =", round(total_downtime, 2))
print("Overall Throughput =", round(total_production, 2))
import numpy as np

num_machines = 5
simulation_days = 30

mean_breakdown_time = 10

weibull_shape = 2
weibull_scale = 3

total_downtime = 0
total_production = 0

for machine in range(num_machines):

    current_time = 0
    downtime = 0

    while current_time < simulation_days:

        working_time = np.random.exponential(mean_breakdown_time)
        current_time += working_time

        if current_time >= simulation_days:
            break

        repair_time = np.random.weibull(weibull_shape) * weibull_scale

        downtime += repair_time
        current_time += repair_time

    production = simulation_days - downtime

    total_downtime += downtime
    total_production += production

    print(f"Machine {machine+1}")
    print(f"Downtime = {downtime:.2f} days")
    print(f"Production Time = {production:.2f} days\n")

print("Total Downtime =", round(total_downtime, 2))
print("Overall Throughput =", round(total_production, 2))