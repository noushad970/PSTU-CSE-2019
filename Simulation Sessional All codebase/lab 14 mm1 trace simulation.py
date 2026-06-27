import random

arrival_time = 0
server_free_time = 0

mean_interarrival = 3
mean_service = 2

customers = 5

print("Cust\tArrival\tStart\tEnd\tQueue")

for i in range(1, customers + 1):

    interarrival = random.expovariate(1 / mean_interarrival)
    service = random.expovariate(1 / mean_service)

    arrival_time += interarrival

    start_service = max(arrival_time, server_free_time)

    end_service = start_service + service

    queue_delay = start_service - arrival_time

    server_free_time = end_service

    print(
        i,
        round(arrival_time, 2),
        round(start_service, 2),
        round(end_service, 2),
        round(queue_delay, 2),
        sep="\t"
    )