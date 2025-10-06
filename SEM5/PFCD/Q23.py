number = int(input("Enter a 4 digit number: "))
sum = 0
for i in range(4):
    digit = number % 10
    sum += digit
    number = number // 10
print("Sum of the digits:", sum)    

'''
    Enter a 4 digit number: 2025
    Sum of the digits: 9
'''