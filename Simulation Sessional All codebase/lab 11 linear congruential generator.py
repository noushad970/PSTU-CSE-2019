a = 5
c = 3
m = 16
seed = 7

n = int(input("Enter number of random numbers: "))

print("\nRandom Numbers:")

for i in range(n):

    seed = (a * seed + c) % m

    random_number = seed / m

    print(random_number)