def gcd(a, b):
    if b == 0:
        return a
    return gcd(b,a%b)

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))
print("GCD:", gcd(num1, num2))


'''
Enter first number: 15
Enter second number: 5
GCD: 5

'''