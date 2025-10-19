def replace_vowels(s):
    vowels = "aeiouAEIOU"
    new_str = ""
    for ch in s:
        if ch in vowels:
            new_str += "*"
        else:
            new_str += ch
    return new_str

input_str = input("Enter a string: ")
print("String after replacing vowels:", replace_vowels(input_str))

'''
Enter a string: Hello World
String after replacing vowels: H*ll* W*rld

'''