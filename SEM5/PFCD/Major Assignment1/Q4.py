'''
4. Using the gross salary function from Question 3, write a function salary bracket that categorizes the
employee’s gross salary into one of the following brackets:
• ”Low income” if gross salary is below Rs. 50,000/-.
• ”Middle income” if gross salary is between Rs. 50,000/- and Rs. 80,000/-.
• ”High income” if gross salary is more than Rs. 80,000/-.

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


def salary_bracket(gross_salary):
    if gross_salary < 50000:
        return "Low income"
    elif 50000 <= gross_salary <= 80000:
        return "Middle income"
    else:
        return "High income"
    

rate = float(input("Enter hourly rate: "))
hours = int(input("Enter hours worked per week: "))

basic = basic_salary(rate, hours)
gross = gross_salary(basic)
bracket = salary_bracket(gross)

print("Basic Salary per month: ₹", basic)
print("Gross Salary after Allowances & Tax: ₹", gross)
print("Salary Bracket:", bracket)


'''
Output Example:

Enter hourly rate: 500
Enter hours worked per week: 45
Basic Salary per month: ₹ 80000.0
Gross Salary after Allowances & Tax: ₹ 84000.0
Salary Bracket: High income

'''