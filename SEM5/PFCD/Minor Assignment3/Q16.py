def basic_calculator():
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    operator = input("Enter the operation (+, -, *, /): ")

    match operator:
        case '+':
            result = num1 + num2
        case '-':
            result = num1 - num2
        case '*':
            result = num1 * num2
        case '/':
            if num2 == 0:
                return "Error: Division by zero!"
            result = num1 / num2
        case _:
            return "Invalid operator!"

    return result

print("Result:", basic_calculator())


'''
Enter the first number: 4
Enter the second number: 2
Enter the operation (+, -, *, /): *
Result: 8.0

'''