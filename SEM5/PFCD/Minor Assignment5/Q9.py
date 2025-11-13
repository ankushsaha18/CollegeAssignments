s = 'mississippi'
letter_count = {}
for char in s:
    if char in letter_count:
        letter_count[char] += 1
    else:
        letter_count[char] = 1

print(letter_count)

'''
{'m': 1, 'i': 4, 's': 4, 'p': 2}

'''