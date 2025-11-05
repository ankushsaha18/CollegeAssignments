def check_vowel_consonant(char):
    vowels = "aeiouAEIOU"
    if char in vowels:
        return "Vowel"
    elif char.isalpha():
        return "Consonant"
    else:
        return "Invalid input"

char = input("Enter a character: ")
print(check_vowel_consonant(char))


'''
Enter a character: z
Consonant

'''