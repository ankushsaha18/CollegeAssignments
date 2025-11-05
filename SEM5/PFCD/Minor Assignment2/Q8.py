num = int(input("Enter an integer: "))

while num <= 0:
    num = int(input("Enter an integer: "))

if num % 2 == 0:
    result = num * 2
    print(f"The number is even. After multiplying by 2: {result}")
else:
    result = num ** 2
    print(f"The number is odd. After squaring: {result}")


'''
Enter an integer: -4
Enter an integer: 0
Enter an integer: -8
Enter an integer: 2
The number is even. After multiplying by 2: 4

'''