import random

customers = 20

order_times = []
payment_times = []
pickup_times = []

for i in range(customers):

    order = random.randint(1, 4)
    payment = random.randint(1, 3)
    pickup = random.randint(2, 6)

    order_times.append(order)
    payment_times.append(payment)
    pickup_times.append(pickup)

    print(
        f"Customer {i+1}: "
        f"Order={order}, "
        f"Payment={payment}, "
        f"Pickup={pickup}"
    )

avg_order = sum(order_times) / customers
avg_payment = sum(payment_times) / customers
avg_pickup = sum(pickup_times) / customers

print("\nAverage Order Time:", round(avg_order, 2))
print("Average Payment Time:", round(avg_payment, 2))
print("Average Pickup Time:", round(avg_pickup, 2))

max_time = max(avg_order, avg_payment, avg_pickup)

if max_time == avg_order:
    bottleneck = "Order Station"
elif max_time == avg_payment:
    bottleneck = "Payment Station"
else:
    bottleneck = "Pickup Station"

print("\nSystem Bottleneck:", bottleneck)