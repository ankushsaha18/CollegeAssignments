def product_of_digits(n):
    product = 1
    while n > 0:
        digit = n % 10    
        product *= digit
        n //= 10     
    return product

num = int(input("Enter a positive number: "))
print("Product of digits:", product_of_digits(num))


'''
Enter a positive number: 125
Product of digits: 10

'''