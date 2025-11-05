num = int(input("Enter a positive integer: "))

if  num < 0:
    print("Please enter a positive integer")
else:

    while num >= 10:  
        sum_digits = 0
        temp = num
        while temp > 0:
            sum_digits += temp % 10
            temp //= 10
        num = sum_digits  

    print("The resulting single-digit number is:", num)


'''
Enter a positive integer: 4367
The resulting single-digit number is: 2

'''