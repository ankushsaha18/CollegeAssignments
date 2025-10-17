score = float(input("Enter your score (0–100): "))

# Determine letter grade and comment
if 90 <= score <= 100:
    grade = 'A'
    comment = 'Excellent'
elif 80 <= score < 90:
    grade = 'B'
    comment = 'Good'
elif 70 <= score < 80:
    grade = 'C'
    comment = 'Average'
elif 60 <= score < 70:
    grade = 'D'
    comment = 'Needs Improvement'
elif 0 <= score < 60:
    grade = 'F'
    comment = 'Failing'
else:
    grade = None
    comment = 'Invalid score!'

# Output result
if grade:
    print(f"Grade: {grade}")
    print(f"Comment: {comment}")
else:
    print(comment)



'''
Enter your score (0–100): 98
Grade: A
Comment: Excellent

'''