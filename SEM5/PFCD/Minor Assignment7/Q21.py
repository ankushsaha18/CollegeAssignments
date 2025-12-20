import re

string1 = "Python Programming Language"

# (a)
match1 = re.fullmatch(r'[A-Za-z]*', string1)
print(match1)

# (b)
match2 = re.sub(r'Programming', 'Coding', string1)
print(match2)

# (c)
match3 = re.split(r'\s+', string1)
print(match3)

# (d)
match8 = re.findall(r'\w+', string1)
print(match8)


'''
None
Python Coding Language
['Python', 'Programming', 'Language']
['Python', 'Programming', 'Language']

'''