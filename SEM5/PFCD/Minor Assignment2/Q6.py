num = int(input("Enter an integer: "))

if num <= 1:
    print(f"{num} is not a prime number.")
else:
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            print(f"{num} is not a prime number.")
            break
    else:
        print(f"{num} is a prime number.")


'''
Enter an integer: 37
37 is a prime number.

'''