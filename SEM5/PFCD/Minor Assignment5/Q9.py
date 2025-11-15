s = 'mississippi'
letter_count = {}
for char in s:
    letter_count[char] = letter_count.get(char, 0) + 1

print(letter_count)

'''
{'m': 1, 'i': 4, 's': 4, 'p': 2}

'''