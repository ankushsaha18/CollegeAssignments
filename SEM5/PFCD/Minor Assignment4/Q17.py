import math

numbers = list(map(float, input("Enter ten numbers: ").split()))

mean = sum(numbers) / len(numbers)

deviation = math.sqrt(sum((x - mean) ** 2 for x in numbers) / (len(numbers) - 1))

print(f"The mean is {mean}")
print(f"The standard deviation is {deviation:.5f}")


'''
Enter ten numbers: 1.6 2 7 12.9 5.5 4.9 10 3 6.6 9.4
The mean is 6.29
The standard deviation is 3.67437

'''