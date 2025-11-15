print("\n----- LIST OPERATIONS MENU -----")
print("1. Create a list of N integers")
print("2. Display the list elements")
print("3. Insert an element at a specific position")
print("4. Delete an element at a given position")
print("5. Exit")

numbers = []

while True:
    choice = int(input("\nEnter your choice (1-5): "))

    match choice:
        case 1:
            numbers.clear()
            N = int(input("Enter N: "))
            for i in range(N):
                value = int(input(f"Enter element {i+1}: "))
                numbers.append(value)

        case 2:
            if numbers:
                print("List:", numbers)
            else:
                print("List is empty")

        case 3:
            if numbers:
                pos = int(input("Enter position to insert: "))
                val = int(input("Enter value to insert: "))
                if 0 < pos <= len(numbers):
                    numbers.insert(pos-1, val)
                    print("List:", numbers)
                else:
                    print("Invalid position!")
            else:
                print("List is empty.")

        case 4:
            if numbers:
                pos = int(input("Enter position to delete: "))
                if 0 < pos < len(numbers):
                    removed = numbers.pop(pos-1)
                    print("List:", numbers)
                else:
                    print("Invalid position!")
            else:
                print("List is empty")

        case 5:
            print("👋Exiting program...")
            break

        case _:
            print("Invalid choice!")


'''
----- LIST OPERATIONS MENU -----
1. Create a list of N integers
2. Display the list elements
3. Insert an element at a specific position
4. Delete an element at a given position
5. Exit

Enter your choice (1-5): 1
Enter N: 4
Enter element 1: 2 
Enter element 2: 5
Enter element 3: 9
Enter element 4: 3

Enter your choice (1-5): 2
List: [2, 5, 9, 3]

Enter your choice (1-5): 3
Enter position to insert: 3
Enter value to insert: 7
List: [2, 5, 7, 9, 3]

Enter your choice (1-5): 4
Enter position to delete: 2
List: [2, 7, 9, 3]

Enter your choice (1-5): 5
👋Exiting program...

'''