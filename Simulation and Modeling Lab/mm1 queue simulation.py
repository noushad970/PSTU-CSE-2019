import random
import math

# ----------- INPUT ------------
mean_interarrival = float(input("Enter Mean Inter-Arrival Time: "))
mean_service = float(input("Enter Mean Service Time: "))
max_customers = int(input("Enter Maximum Number of Customers: "))

# ----------- INITIALIZATION ------------
clock = 0.0
arrival_time = 0.0
departure_time = 0.0

total_delay = 0.0
total_queue_length_time = 0.0
server_busy_time = 0.0

num_in_queue = 0
area_num_in_queue = 0.0
last_event_time = 0.0

# Lists to store data
arrival_times = []
service_times = []
start_service_times = []
departure_times = []
waiting_times = []

# ----------- SIMULATION ------------
for i in range(max_customers):

    # Generate inter-arrival time
    interarrival = -mean_interarrival * math.log(random.random())
    arrival_time += interarrival

    # Generate service time
    service_time = -mean_service * math.log(random.random())

    # Service starts at max(arrival_time, last departure_time)
    start_service = max(arrival_time, departure_time)

    # Waiting time
    wait = start_service - arrival_time

    # Departure time
    departure_time = start_service + service_time

    # Update statistics
    total_delay += wait
    server_busy_time += service_time

    # Store values
    arrival_times.append(arrival_time)
    service_times.append(service_time)
    start_service_times.append(start_service)
    departure_times.append(departure_time)
    waiting_times.append(wait)

# ----------- FINAL CALCULATIONS ------------

simulation_end_time = departure_time

average_delay = total_delay / max_customers
server_utilization = server_busy_time / simulation_end_time

# Little's Law Approximation
average_number_in_queue = (total_delay) / simulation_end_time

# ----------- OUTPUT ------------
print("\n--- Simulation Results ---")
print("Average Delay in Queue:", round(average_delay, 4))
print("Average Number in Queue:", round(average_number_in_queue, 4))
print("Server Utilization:", round(server_utilization, 4))
print("Time Simulation Ended:", round(simulation_end_time, 4))