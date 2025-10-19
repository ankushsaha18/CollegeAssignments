from datetime import datetime, timedelta

def calculate_new_date():
    today_date = input("Today's date (YYYY-MM-DD): ")
    today_day = input("Today's day: ")
    days_to_add = int(input("Number of days: "))

    date_obj = datetime.strptime(today_date, "%Y-%m-%d")
    new_date = (date_obj + timedelta(days=days_to_add)).strftime("%Y-%m-%d")
    week_days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
    new_day = week_days[(week_days.index(today_day) + days_to_add) % 7]
    
    return new_date, new_day


new_date, new_day = calculate_new_date()
print("New date:", new_date)
print("New day:", new_day)


'''
Today's date (YYYY-MM-DD): 2025-10-19
Today's day: Sunday
Number of days: 50
New date: 2025-12-08
New day: Monday

'''