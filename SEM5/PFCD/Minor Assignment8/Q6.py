import csv

first_name = input("Enter first name: ")
last_name = input("Enter last name: ")

exam1 = int(input("Enter exam 1 grade: "))
exam2 = int(input("Enter exam 2 grade: "))
exam3 = int(input("Enter exam 3 grade: "))

with open("grades.csv", "a", newline="") as file:
    writer = csv.writer(file)
    writer.writerow([first_name, last_name, exam1, exam2, exam3])

print("Student record saved successfully.")
