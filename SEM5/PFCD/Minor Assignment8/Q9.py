def divide(a, b):
    try:
        a = float(a)
        b = float(b)
        if b == 0:
            return "Error: Division by zero is not allowed"
        return a / b
    except ValueError:
        return "Error: Inputs must be numeric"

print(divide(10, 2)) 
print(divide(10, 0))   
print(divide(10, "x"))  
