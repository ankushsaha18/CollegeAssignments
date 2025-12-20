import re

s = input("Enter string: ")

digits = len(re.findall(r'\d', s))
non_digits = len(re.findall(r'\D', s))
whitespace = len(re.findall(r'\s', s))
words = len(re.findall(r'\b\w+\b', s))

print("Digits:", digits)
print("Non-digits:", non_digits)
print("Whitespace:", whitespace)
print("Words:", words)


'''
Enter string: abc123#
Digits: 3
Non-digits: 4
Whitespace: 0
Words: 1

'''