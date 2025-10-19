def decimal_to_binary(decimal):
    binary = ""
    while decimal > 0:
        binary = str(decimal % 2) + binary
        decimal //= 2
    return int(binary)

def binary_to_decimal(binary):
    decimal = 0
    for i in range(len(str(binary))):
        decimal += (binary % 10) * (2 ** i)
        binary //= 10
    return decimal

decimal = int(input("Enter a decimal number: "))
print(f"Binary representation: {decimal_to_binary(decimal)}")

binary = int(input("Enter a binary number: "))
print(f"Decimal representation: {binary_to_decimal(binary)}")

'''
Enter a decimal number: 25
Binary representation: 11001
Enter a binary number: 1100
Decimal representation: 12

'''