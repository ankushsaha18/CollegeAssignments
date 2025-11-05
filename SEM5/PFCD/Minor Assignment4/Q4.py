numbers = list(map(int, input("Enter numbers: ").split()))
element = int(input("Enter element to remove: "))

while element in numbers:
    numbers.remove(element)

print("Updated list:", numbers)

'''
Enter numbers: 2 3 4 5 3 78 3 9
Enter element to remove: 3
Updated list: [2, 4, 5, 78, 9]

'''