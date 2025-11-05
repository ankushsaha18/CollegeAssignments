a = int(input("Enter first number: "))  
b = int(input("Enter second number: "))  
c = int(input("Enter third number: "))

largest = max(a, b, c)
smallest = min(a, b, c)
sum = a + b + c
mid = sum - largest - smallest

print(smallest, mid, largest)


'''
    Enter first number: 2
    Enter second number: 1
    Enter third number: 4
    1 2 4
'''