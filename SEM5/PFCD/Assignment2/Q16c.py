n = int(input("Enter the number of terms n: "))

sum_c = 0
for i in range(n):
    term = 2 * i + 1  
    if i % 2 != 0:
        term = -term  
    sum_c += term

print(f"Sum of the series (c) = {sum_c}")


'''
Enter the number of terms n: 5
Sum of the series (c) = 5

'''