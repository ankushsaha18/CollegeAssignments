days = int(input("Enter number of days: "))
hours = int(input("Enter number of hours: "))
minutes = int(input("Enter number of minutes: "))
seconds = int(input("Enter number of seconds: "))

total_seconds = days*24*60*60 + hours*60*60 + minutes*60 + seconds
print("Total time in seconds:", total_seconds)

'''
    Enter number of days: 2
    Enter number of hours: 3
    Enter number of minutes: 43
    Enter number of seconds: 23
    Total time in seconds: 186203
'''