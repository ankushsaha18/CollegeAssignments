num = int(input("Enter a number: "))
reversed= 0
if num <= 0: 
    print("Please enter a positive number.")
else:
    while num > 0:
        digit = num % 10
        reversed = reversed * 10 + digit
        num = num // 10
    print(f"Reversed number is: {reversed}")

'''
Enter a number: 1234
Reversed number is: 4321
    
'''