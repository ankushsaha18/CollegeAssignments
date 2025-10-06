import math

a = int(input("Enter the first integer a: "))
b = int(input("Enter the second integer b: "))

sum = a + b

difference = a - b

product = a * b

quotient = a / b

remainder = a % b

log = math.log10(a)

power = a**b

string = str(a) + str(b)

print(f"Sum: {sum}")
print(f"Difference: {difference}")
print(f"Product: {product}")
print(f"Quotient: {quotient}")
print(f"Remainder: {remainder}")
print(f"log10(a): {log}")
print(f"a^b: {power}")
print(f"Result of ab: {string}")     


'''
    Enter the first integer a: 4
    Enter the second integer b: 2
    Sum: 6
    Difference: 2
    Product: 8
    Quotient: 2.0
    Remainder: 0
    log10(a): 0.6020599913279624
    a^b: 16
    Result of ab: 42
'''