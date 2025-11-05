def are_coprime(a, b):
    while b != 0:
        a, b = b, a % b
    return a == 1

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
print("Are coprime:" , are_coprime(num1, num2))


'''
Enter first number: 14
Enter second number: 15
Are coprime: True

'''