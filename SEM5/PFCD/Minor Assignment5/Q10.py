s = input("Enter a string: ").lower()
vowels = 'aeiou'
vowel_count = {}
for char in s:
    if char in vowels:
        vowel_count[char] = vowel_count.get(char, 0) + 1
print("Vowels present:", ','.join(vowel_count.keys()))
print("Number of occurrences of each vowel:", vowel_count)


'''
Enter a string: Hello World
Vowels present: e,o
Number of occurrences of each vowel: {'e': 1, 'o': 2}

'''