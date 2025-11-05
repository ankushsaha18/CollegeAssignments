'''
5. Take three different sets of employee names, hourly rates and hours worked per week as user input.
Write a Python function employee report that generates a formatted report of all employees’ salary
details. This function should print the employee names, basic salaries, gross salaries, tax amounts,
and salary brackets in a readable format.

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
        return 0.10 * basic_salary
    elif 60000 <= basic_salary <= 85000:
        return 0.15 * basic_salary
    else:
        return 0.20 * basic_salary


def gross_salary(basic_salary):
    allowance = 0.20 * basic_salary
    tax = tax_amount(basic_salary)
    return basic_salary + allowance - tax


def salary_bracket(gross_salary):
    if gross_salary < 50000:
        return "Low income"
    elif 50000 <= gross_salary <= 80000:
        return "Middle income"
    else:
        return "High income"


def employee_report():
    employees = []

    for i in range(3):
        print(f"\nEnter details for Employee {i+1}:")
        name = input("Enter Employee Name: ")
        rate = float(input("Enter Hourly Rate (₹): "))
        hours = float(input("Enter Hours Worked per Week: "))

        basic = basic_salary(rate, hours)
        gross = gross_salary(basic)
        tax = tax_amount(basic)
        bracket = salary_bracket(gross)

        employees.append({
            "Name": name,
            "Basic": basic,
            "Gross": gross,
            "Tax": tax,
            "Bracket": bracket
        })

    print("\n" + "=" * 80)
    print(f"{'EMPLOYEE SALARY REPORT':^80}")
    print("=" * 80)
    print(f"{'Name':<15}{'Basic Salary (₹)':<20}{'Gross Salary (₹)':<20}{'Tax (₹)':<10}{'Bracket'}")
    print("-" * 80)

    for emp in employees:
        print(f"{emp['Name']:<15}{emp['Basic']:<20.2f}{emp['Gross']:<20.2f}{emp['Tax']:<10.2f}{emp['Bracket']}")

    print("=" * 80)

employee_report()


'''
Output Example:


Enter details for Employee 1:
Enter Employee Name: Ankush
Enter Hourly Rate (₹): 500
Enter Hours Worked per Week: 45

Enter details for Employee 2:
Enter Employee Name: Rohit
Enter Hourly Rate (₹): 400
Enter Hours Worked per Week: 37

Enter details for Employee 3:
Enter Employee Name: Richa
Enter Hourly Rate (₹): 450
Enter Hours Worked per Week: 40

================================================================================
                             EMPLOYEE SALARY REPORT                             
================================================================================
Name           Basic Salary (₹)    Gross Salary (₹)    Tax (₹)   Bracket
--------------------------------------------------------------------------------
Ankush         80000.00            84000.00            12000.00  High income
Rohit          59200.00            65120.00            5920.00   Middle income
Richa          72000.00            75600.00            10800.00  Middle income
================================================================================

'''