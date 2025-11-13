students = {}
n = int(input("Enter number of students: "))
for i in range(n):
    name = input("Enter student name: ")
    marks = int(input("Enter marks: "))
    students[name] = marks  

print("\nStudent Data:", students)

search_name = input("\nEnter student name to display marks: ")

if search_name in students:
    print("Marks of", search_name, "=", students[search_name])
else:
    print("Student not found!")


'''
Enter number of students: 3
Enter student name: Ankush
Enter marks: 95
Enter student name: Rohit
Enter marks: 88
Enter student name: Kavya
Enter marks: 85

Student Data: {'Ankush': 95, 'Rohit': 88, 'Kavya': 85}

Enter student name to display marks: Ankush
Marks of Ankush = 95

'''