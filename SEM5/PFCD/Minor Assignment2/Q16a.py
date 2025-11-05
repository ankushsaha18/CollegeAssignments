x = float(input("Enter the value of x: "))
n = int(input("Enter the number of terms n: "))

sum_a = 0

factorial = 1
for i in range(n):
    power = 2 * i

    factorial = 1
    for j in range(1, power + 1):
        factorial *= j
    term = ((-1) ** i) * (x ** power) / factorial
    sum_a += term

print(f"Sum of the series (a) = {sum_a}")


'''
Enter the value of x: 5
Enter the number of terms n: 2
Sum of the series (a) = -11.5

'''