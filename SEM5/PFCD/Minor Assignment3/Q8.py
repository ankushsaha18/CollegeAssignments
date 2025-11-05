def days_in_month(month):
    
    if month in ["january", "march", "may", "july", "august", "october", "december"]:
        print("No. of days: 31 days")

    elif month in ["april", "june", "september", "november"]:
        print("No. of days in: 30 days")

    elif month == "february":
        print("No. of days: 28/29 days")
    else:
        print("Invalid month name!")

month = input("Enter the name of the month: ").lower()
days_in_month(month)

'''
Enter the name of the month: January
No. of days: 31 days

'''