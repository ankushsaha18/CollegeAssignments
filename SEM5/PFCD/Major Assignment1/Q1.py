'''
Q1. Write a Python function basic salary that accepts two parameters: hourly rate and hours worked per week.
The function should calculate the basic salary per month (assuming a month has 4 weeks). If the hours
worked per week exceed 40, create another function overtime salary, where every extra hour worked
is paid at 1.5 times the normal hourly rate. Finally, create another function total salary that returns
the sum of the basic salary and overtime.
'''

def basic_salary(hourly_rate, hours_per_week):
    if hours_per_week > 40:
        hours_per_week = 40
    return hourly_rate * hours_per_week * 4


def overtime_salary(hourly_rate, hours_per_week):
    if hours_per_week > 40:
        overtime_hours = hours_per_week - 40
        return overtime_hours * (hourly_rate * 1.5) * 4
    else:
        return 0


def total_salary(hourly_rate, hours_per_week):
    basic = basic_salary(hourly_rate, hours_per_week)
    overtime = overtime_salary(hourly_rate, hours_per_week)
    return basic + overtime


rate = float(input("Enter hourly rate: "))
hours = int(input("Enter hours worked per week: "))

print(f"Basic Salary: ₹{basic_salary(rate, hours)}")
print(f"Overtime Salary: ₹{overtime_salary(rate, hours)}")
print(f"Total Salary: ₹{total_salary(rate, hours)}")    


'''
Output Example:

Enter hourly rate: 500
Enter hours worked per week: 45
Basic Salary: ₹80000.0
Overtime Salary: ₹15000.0
Total Salary: ₹95000.0

'''