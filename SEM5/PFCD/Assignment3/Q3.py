def sum_of_even_squares():
    total = 0
    for num in range(1, 51):
        if num % 2 == 0:
            total += num ** 2
    return total

print("Sum of even squares =",sum_of_even_squares())

'''
Sum of even squares = 22100

'''