import random

n = int(input("Enter the number of elements: "))

squares = tuple(random.randint(1, 10) ** 2 for _ in range(n))

print("Tuple:", squares)


'''
Enter the number of elements: 7
Tuple: (36, 4, 16, 81, 49, 1, 64)

'''