def find_digits(num):
    if num <= 0:
        print("Enter a positive integer")
        return 0
    digits = 0
    while num > 0:
        num //= 10
        digits += 1
    return digits

num = int(input("Enter a positive integer: "))
print("Number of digits:",find_digits(num))

'''
Enter a positive integer: 79374
Number of digits: 5

'''