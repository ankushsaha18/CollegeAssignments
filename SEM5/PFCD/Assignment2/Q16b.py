x = float(input("Enter the value of x: "))
n = int(input("Enter the number of terms n: "))

sum_b = 0

for i in range(n + 1):
    factorial = 1
    for j in range(1, i + 1):
        factorial *= j
    term = (x ** i) / factorial
    sum_b += term

print(f"Sum of the series (b) = {sum_b}")


'''
Enter the value of x: 4
Enter the number of terms n: 3
Sum of the series (b) = 23.666666666666664

'''