import math
import matplotlib.pyplot as plt
print("Task 1: Poisson Distribution for λ = 5\n")
lam = 5

x_values = range(11)
probabilities = []

print("Poisson Distribution (λ = 5)\n")

for x in x_values:
    p = (math.exp(-lam) * (lam ** x)) / math.factorial(x)
    probabilities.append(p)

    print(f"P(X={x}) = {p:.6f}")

plt.figure(figsize=(8,5))
plt.bar(x_values, probabilities)

plt.xlabel("Number of Calls")
plt.ylabel("Probability")
plt.title("Poisson PMF (λ = 5)")
plt.grid(True)

plt.show()
print("Task 2: Poisson Distribution for Different λ Values\n")
x = range(31)

lambda_values = [10, 15]

for lam in lambda_values:

    probabilities = []

    for i in x:
        p = (math.exp(-lam) * (lam ** i)) / math.factorial(i)
        probabilities.append(p)

    plt.figure(figsize=(8,5))

    plt.bar(x, probabilities)

    plt.xlabel("Number of Calls")
    plt.ylabel("Probability")
    plt.title(f"Poisson PMF (λ = {lam})")

    plt.grid(True)

    plt.show()