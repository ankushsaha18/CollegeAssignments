'''
3. Using the function basic salary from Question 1, write another function gross salary that calculates
the gross salary of an employee. This function should accept basic salary as input (output from
Question 1), consider a fixed value of allowances (e.g., 20% of basic salary), and return the gross
salary (basic salary + allowances - tax).

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


def tax_amount(basic_salary):
    if basic_salary < 60000:
        tax = 0.10 * basic_salary
    elif 60000 <= basic_salary <= 85000:
        tax = 0.15 * basic_salary
    else:
        tax = 0.20 * basic_salary
    return tax


def gross_salary(basic_salary):
    allowance = 0.20 * basic_salary
    tax = tax_amount(basic_salary)
    gross = basic_salary + allowance - tax
    return gross


rate = float(input("Enter hourly rate: "))
hours = int(input("Enter hours worked per week: "))

basic = basic_salary(rate, hours)
overtime = overtime_salary(rate, hours)
total = total_salary(rate, hours)
tax = tax_amount(basic)
gross = gross_salary(basic)

print("Basic Salary per month: ₹", basic)
print("Overtime Salary per month: ₹", overtime)
print("Total Salary per month: ₹", total)
print("Tax Deducted: ₹", tax)
print("Gross Salary after Allowances & Tax: ₹", gross)


'''
Output Example:

Enter hourly rate: 500
Enter hours worked per week: 45
Basic Salary per month: ₹ 80000.0
Overtime Salary per month: ₹ 15000.0
Total Salary per month: ₹ 95000.0
Tax Deducted: ₹ 12000.0
Gross Salary after Allowances & Tax: ₹ 84000.0

'''