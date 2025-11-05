'''
Q2. Create a function tax amount that shows how much taxes are deducted from the basic salary. Taxes
are applied as follows:
• If the salary is less than Rs. 60,000/-, deduct 10% as tax.
• If the salary is between Rs. 60,000/- and Rs. 85,000/-, deduct 15% as tax.
• If the salary is more than Rs. 85,000/-, deduct 20% as tax.

'''


def tax_amount(basic_salary):
    if basic_salary < 60000:
        tax = 0.10 * basic_salary
    elif 60000 <= basic_salary <= 85000:
        tax = 0.15 * basic_salary
    else:
        tax = 0.20 * basic_salary
    return tax

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

basic = basic_salary(rate, hours)
overtime = overtime_salary(rate, hours)
total = total_salary(rate, hours)
tax = tax_amount(basic)

print(f"Basic Salary: ₹{basic}")
print(f"Overtime Salary: ₹{overtime}")
print(f"Total Salary: ₹{total}")
print(f"Tax Amount on Basic Salary: ₹{tax}")
print(f"Net Salary after Tax Deduction: ₹{total - tax}")


'''
Output Example:

Enter hourly rate: 500
Enter hours worked per week: 45
Basic Salary: ₹80000.0
Overtime Salary: ₹15000.0
Total Salary: ₹95000.0
Tax Amount on Basic Salary: ₹12000.0
Net Salary after Tax Deduction: ₹83000.0

'''
