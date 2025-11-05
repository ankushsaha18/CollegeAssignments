n = int(input("Enter a positive integer: "))

if n < 1:
    print("Please enter a positive integer.")
else:
    fact = 1
    i = 1

    while fact < n:
        i += 1
        fact *= i

    if fact == n:
        print(f"{n} is a factorial number ({i}!)")
    else:
        print(f"{n} is not a factorial number")


'''
Enter a positive integer: 5
5 is not a factorial number

Enter a positive integer: 120
120 is a factorial number (5!)

'''