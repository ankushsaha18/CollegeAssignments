import random

N = int(input("Enter the size of the list: "))

numbers = [random.randint(1, 1000) for _ in range(N)]

print("Random numbers:", numbers)

total = sum(numbers)
average = total / N if N != 0 else 0

print("Sum of numbers:", total)
print("Average of numbers:", average)


'''
Enter the size of the list: 5
Random numbers: [597, 982, 670, 959, 342]
Sum of numbers: 3550
Average of numbers: 710.0

'''