def remove_vowels(s):
    vowels = "aeiouAEIOU"
    new_str = ""
    for ch in s:
        if ch not in vowels:
            new_str += ch
    return new_str

input_str = input("Enter a string: ")
print("String without vowels:", remove_vowels(input_str))


'''
Enter a string: Hello World
String without vowels: Hll Wrld

'''