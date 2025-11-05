def nth_fibonacci(n):
    if(n<=0):
        return "Input should be a positive integer."
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    return nth_fibonacci(n - 1) + nth_fibonacci(n - 2)

n = int(input("Enter the value of n: "))
print(f"The {n}th Fibonacci number is: {nth_fibonacci(n)}")


'''
Enter the value of n: 4
The 4th Fibonacci number is: 2

'''