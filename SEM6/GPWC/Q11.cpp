#include <iostream>
using namespace std;

class Employee
{
private:
    string name, designation, address, pan;
    int age;
    double grossSalary, deduction, taxableIncome;
    double incomeTax, cess, totalTax;

public:

    // Default Constructor
    Employee()
    {
        name = "NA";
        designation = "NA";
        address = "NA";
        pan = "NA";
        age = 0;
        grossSalary = 0;
        deduction = 0;
        taxableIncome = 0;
        incomeTax = 0;
        cess = 0;
        totalTax = 0;
    }

    // Parameterized Constructor with default arguments
    Employee(string n, string d = "Asst. Prof", string addr = "Bhubaneswar",
             int a = 36, string p = "XA0845QA", double gs = 1275000)
    {
        name = n;
        designation = d;
        address = addr;
        age = a;
        pan = p;
        grossSalary = gs;

        deduction = 75000;
        taxableIncome = grossSalary - deduction;

        calculateTax();
    }

    void calculateTax()
    {
        if ( taxableIncome <= 300000 )
            incomeTax = 0;

        else if ( taxableIncome <= 700000 )
            incomeTax = ( taxableIncome - 300000 ) * 0.05;

        else if ( taxableIncome <= 1000000 )
            incomeTax = 20000 + ( taxableIncome - 700000 ) * 0.10;

        else if ( taxableIncome <= 1200000 )
            incomeTax = 50000 + ( taxableIncome - 1000000 ) * 0.15;

        else if ( taxableIncome <= 1500000 )
            incomeTax = 80000 + ( taxableIncome - 1200000 ) * 0.20;

        else
            incomeTax = 140000 + ( taxableIncome - 1500000 ) * 0.30;

        cess = incomeTax * 0.04;

        totalTax = incomeTax + cess;
    }

    void printTax()
    {
        cout << "Name in Full : " << name << endl;
        cout << "Designation  : " << designation << endl;
        cout << "Address      : " << address << endl;
        cout << "AGE : " << age << endl;
        cout << "PAN : " << pan << endl;

        cout << "--------------------------------------------------------------------------" << endl;

        cout << "For the Financial Year 2024-25 (A.Y. 2025-26)" << endl;

        cout << "--------------------------------------------------------------------------" << endl;

        cout << "| Gross Salary (Pay + GP + DA + HRA + ALLOWANCES) | Rs. " << grossSalary << " |" << endl;
        cout << "| Less: Standard Deduction U/s 16(ia)             | Rs. " << deduction << " |" << endl;
        cout << "|-------------------------------------------------|----------------------|" << endl;
        cout << "| Total Income / Taxable income                   | Rs. " << taxableIncome << " |" << endl;

        cout << "--------------------------------------------------------------------------" << endl;

        cout << "Calculation of Income Tax" << endl;
        cout << "Income <= 300000.00 : NIL" << endl;
        cout << "300000 <= Income < 700000 : 5% of income that exceed 300000.00" << endl;
        cout << "700000 <= Income < 1000000 : 20000.00 + 10% of income that exceed 700000.00" << endl;
        cout << "1000000 <= Income < 1200000 : 50000.00 + 15% of income that exceed 1000000.00" << endl;
        cout << "1200000 <= Income < 1500000 : 80000.00 + 20% of income that exceed 1200000.00" << endl;
        cout << "Income > 1500000 : 140000.00 + 30% of income that exceed 1500000.00" << endl;

        cout << "--------------------------------------------------------------------------" << endl;

        cout << "| Income Tax | Rs. " << incomeTax << " |" << endl;
        cout << "| Rebate Total Income Less than Rs.7 Lakhs | Rs. 0.00 |" << endl;
        cout << "|-------------------------------------------|-----------|" << endl;
        cout << "| Total Tax | Rs. " << incomeTax << " |" << endl;
        cout << "| Health & Education Cess @ 4% | Rs. " << cess << " |" << endl;
        cout << "| Addl. Surcharge @ 10% (if income >= 50 Lakhs) | NA |" << endl;
        cout << "| Addl. Surcharge @ 15% (if income >= 1 Crore) | NA |" << endl;

        cout << "--------------------------------------------------------------------------" << endl;

        cout << "| Total tax payable | Rs. " << totalTax << " |" << endl;

        cout << "--------------------------------------------------------------------------" << endl;
    }
};

int main()
{
    Employee emp1; 
    Employee emp2 ( "Satya Brata Rout" ); 

    emp2.printTax();

    return 0;
}


/*

Name in Full : Satya Brata Rout
Designation  : Asst. Prof
Address      : Bhubaneswar
AGE : 36
PAN : XA0845QA
--------------------------------------------------------------------------
For the Financial Year 2024-25 (A.Y. 2025-26)
--------------------------------------------------------------------------
| Gross Salary (Pay + GP + DA + HRA + ALLOWANCES) | Rs. 1.275e+06 |
| Less: Standard Deduction U/s 16(ia)             | Rs. 75000 |
|-------------------------------------------------|----------------------|
| Total Income / Taxable income                   | Rs. 1.2e+06 |
--------------------------------------------------------------------------
Calculation of Income Tax
Income <= 300000.00 : NIL
300000 <= Income < 700000 : 5% of income that exceed 300000.00
700000 <= Income < 1000000 : 20000.00 + 10% of income that exceed 700000.00
1000000 <= Income < 1200000 : 50000.00 + 15% of income that exceed 1000000.00
1200000 <= Income < 1500000 : 80000.00 + 20% of income that exceed 1200000.00
Income > 1500000 : 140000.00 + 30% of income that exceed 1500000.00
--------------------------------------------------------------------------
| Income Tax | Rs. 80000 |
| Rebate Total Income Less than Rs.7 Lakhs | Rs. 0.00 |
|-------------------------------------------|-----------|
| Total Tax | Rs. 80000 |
| Health & Education Cess @ 4% | Rs. 3200 |
| Addl. Surcharge @ 10% (if income >= 50 Lakhs) | NA |
| Addl. Surcharge @ 15% (if income >= 1 Crore) | NA |
--------------------------------------------------------------------------
| Total tax payable | Rs. 83200 |
--------------------------------------------------------------------------


*/