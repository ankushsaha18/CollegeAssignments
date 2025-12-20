import re

string1 = "Python Programming Language"

match1 = re.search(r'. m?', string1)
print(match1.group())

match3 = re.search(r'.*Language$', string1)
print(match3.group())

match4 = re.search(r'\w*\s\w*', string1)
print(match4.group())

match5 = re.search(r'.*', string1)
print(match5.group())


'''
n 
Python Programming Language
Python Programming
Python Programming Language

'''