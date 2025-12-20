import re

def is_secure_password(password):
    pattern = r'^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%&*?]).{8,}$'
    return bool(re.match(pattern, password))

pwd = input("Enter password: ")
print(is_secure_password(pwd))

'''
Enter password: Abcd#1234
True

'''