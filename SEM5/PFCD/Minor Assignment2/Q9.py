try:
    user_input = input("Enter an integer: ")
    number = int(user_input)

    remainder = number % 5

    match remainder:
        case 0:
            print(f"The remainder when {number} is divided by 5 is 0.")
        case 1:
            print(f"The remainder when {number} is divided by 5 is 1.")
        case 2:
            print(f"The remainder when {number} is divided by 5 is 2.")
        case 3:
            print(f"The remainder when {number} is divided by 5 is 3.")
        case 4:
            print(f"The remainder when {number} is divided by 5 is 4.")

except ValueError:
    print("Invalid input")


'''
Enter an integer: 56
The remainder when 56 is divided by 5 is 1.

'''