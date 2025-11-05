while True:
    user_input = input("Enter: ")

    if user_input.lower() == "exit":
        print("Exiting calculator")
        break

    parts = user_input.split()

    if len(parts) != 3:
        print("Invalid input format")
        continue

    num1, num2, op = parts

    num1 = int(num1)
    num2 = int(num2)

    if op == '+':
        print("Result:", num1 + num2)
    elif op == '-':
        print("Result:", num1 - num2)
    elif op == '*':
        print("Result:", num1 * num2)
    elif op == '/':
        if num2 == 0:
            print("Error: Division by zero not allowed.")
        else:
            print("Result:", num1 / num2)
    else:
        print("Invalid operator")



'''
Enter: 4 3 *
Result: 12
Enter: 6 2 /
Result: 3.0
Enter: exit
Exiting calculator

'''