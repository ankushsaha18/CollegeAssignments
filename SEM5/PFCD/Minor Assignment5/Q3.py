data = {}
n = int(input("Enter number of items: "))

for i in range(n):
    key = input("Enter key: ")
    value = float(input("Enter value: "))
    data[key] = value

total = sum(data.values())

print("\nDictionary:", data)
print("Sum of values =", total)


'''
Enter number of items: 5
Enter key: A
Enter value: 1
Enter key: B
Enter value: 2
Enter key: C
Enter value: 3
Enter key: D
Enter value: 4
Enter key: E
Enter value: 5

Dictionary: {'A': 1.0, 'B': 2.0, 'C': 3.0, 'D': 4.0, 'E': 5.0}
Sum of values = 15.0

'''