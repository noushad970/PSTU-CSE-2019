import matplotlib.pyplot as plt

p = 0.85
q = 1 - p

mean = p
variance = p * q

print("Bernoulli Distribution (Quality Control)\n")

print("X = 1 : Chip Works (Success)")
print("X = 0 : Chip Fails (Defect)\n")

print("P(X=0) =", q)
print("E[X] =", mean)
print("Var(X) =", variance)

x = [0, 1]
probabilities = [q, p]

plt.bar(x, probabilities)

plt.xticks([0, 1], ['Failure (0)', 'Success (1)'])
plt.xlabel("Outcome")
plt.ylabel("Probability")
plt.title("Bernoulli Distribution of Microchip Testing")

plt.show()