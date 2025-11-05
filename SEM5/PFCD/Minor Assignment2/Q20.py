num = int(input("Enter an integer greater than 1: "))

if num <= 1:
    print("Please enter an integer greater than 1")
else:
    n = num
    factors = []

    divisor = 2
    while n > 1:
        if n % divisor == 0:
            factors.append(divisor)
            n //= divisor
        else:
            divisor += 1  

    print("Factors:", factors)


'''
Enter an integer greater than 1: 120
Factors: [2, 2, 2, 3, 5]

'''