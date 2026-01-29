import random
import math

# -----------------------------
# Utility: Exponential random
# -----------------------------
def exponential(rate):
    return -math.log(1 - random.random()) / rate


# -----------------------------
# Parameters
# -----------------------------
SIM_TIME = 1000          # total simulation time
ARRIVAL_RATE = 0.5       # λ (customers per unit time)
SERVICE_RATE = 0.6       # μ
INITIAL_INVENTORY = 20
REORDER_POINT = 5
REORDER_QTY = 15
LEAD_TIME = 10


# -----------------------------
# State Variables
# -----------------------------
clock = 0.0
server_busy = False
queue = []

inventory = INITIAL_INVENTORY
next_arrival = exponential(ARRIVAL_RATE)
next_departure = float('inf')

reorder_pending = False
reorder_arrival_time = float('inf')

# Statistics
customers_served = 0
customers_lost = 0
total_waiting_time = 0.0


# -----------------------------
# Simulation Loop
# -----------------------------
while clock < SIM_TIME:

    # Find next event
    next_event_time = min(next_arrival, next_departure, reorder_arrival_time)
    clock = next_event_time

    # -----------------------------
    # Arrival Event
    # -----------------------------
    if clock == next_arrival:
        next_arrival = clock + exponential(ARRIVAL_RATE)

        if inventory > 0:
            queue.append(clock)
            inventory -= 1
        else:
            customers_lost += 1

        if not server_busy and queue:
            arrival_time = queue.pop(0)
            waiting_time = clock - arrival_time
            total_waiting_time += waiting_time

            service_time = exponential(SERVICE_RATE)
            next_departure = clock + service_time
            server_busy = True

        # Inventory reorder check
        if inventory <= REORDER_POINT and not reorder_pending:
            reorder_pending = True
            reorder_arrival_time = clock + LEAD_TIME

    # -----------------------------
    # Departure Event
    # -----------------------------
    elif clock == next_departure:
        customers_served += 1

        if queue:
            arrival_time = queue.pop(0)
            waiting_time = clock - arrival_time
            total_waiting_time += waiting_time

            service_time = exponential(SERVICE_RATE)
            next_departure = clock + service_time
        else:
            server_busy = False
            next_departure = float('inf')

    # -----------------------------
    # Inventory Reorder Arrival
    # -----------------------------
    else:
        inventory += REORDER_QTY
        reorder_pending = False
        reorder_arrival_time = float('inf')


# -----------------------------
# Results
# -----------------------------
print("SIMULATION RESULTS")
print("------------------")
print(f"Customers served     : {customers_served}")
print(f"Customers lost       : {customers_lost}")
print(f"Average waiting time : {total_waiting_time / max(customers_served,1):.2f}")
print(f"Final inventory      : {inventory}")
