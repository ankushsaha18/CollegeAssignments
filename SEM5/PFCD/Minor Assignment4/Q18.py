numbers = list(map(int, input("Enter numbers: ").split()))

squares = [x ** 2 for x in numbers]

print("Original list:", numbers)
print("List of squares:", squares)


'''
Enter numbers: 1 5 3 9 6 12
Original list: [1, 5, 3, 9, 6, 12]
List of squares: [1, 25, 9, 81, 36, 144]

'''