import random

num_atms = 3
customers = 30

atm_free_time = [0] * num_atms

current_time = 0
max_queue = 0

for i in range(customers):

    inter_arrival = random.randint(1, 3)
    service_time = random.randint(2, 5)

    current_time += inter_arrival

    available_atm = atm_free_time.index(min(atm_free_time))

    if atm_free_time[available_atm] > current_time:
        queue_length = sum(
            1 for t in atm_free_time if t > current_time
        )
        max_queue = max(max_queue, queue_length)

        start_time = atm_free_time[available_atm]
    else:
        start_time = current_time

    atm_free_time[available_atm] = start_time + service_time

    print(
        f"Customer {i+1}: "
        f"Arrival={current_time}, "
        f"ATM={available_atm+1}, "
        f"Finish={atm_free_time[available_atm]}"
    )

print("\nMaximum Queue Length:", max_queue)