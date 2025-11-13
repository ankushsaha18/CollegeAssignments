students = {}

n = int(input("Enter number of students: "))

for i in range(n):
    name = input("Enter student name: ")
    percentage = float(input("Enter percentage of marks: "))
    students[name] = percentage

print("\n--- Student Information ---")
for name, percent in students.items():
    print(f"Name: {name:7s}  | Percentage:, {percent}, %")


'''
Enter number of students: 3
Enter student name: Ankush
Enter percentage of marks: 95
Enter student name: Rohit
Enter percentage of marks: 89
Enter student name: Kavya
Enter percentage of marks: 85

--- Student Information ---
Name: Ankush   | Percentage:, 95.0, %
Name: Rohit    | Percentage:, 89.0, %
Name: Kavya    | Percentage:, 85.0, %

'''