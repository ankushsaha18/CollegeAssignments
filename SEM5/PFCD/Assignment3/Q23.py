def vowel_indices(s):
    vowels = "aeiouAEIOU"
    indices = []
    for i in range(len(s)):
        if s[i] in vowels:
            indices.append(i)
    return indices

input_str = input("Enter a string: ")
print("Indices of vowels:", vowel_indices(input_str))


'''
Enter a string: Hello World
Indices of vowels: [1, 4, 7]

'''