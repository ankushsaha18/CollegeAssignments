def remove_punctuation(s):
    punctuation = "!()-[]{};:'\"\,<>./?@#$%^&*_~"
    result = ""
    for ch in s:
        if ch not in punctuation:
            result += ch
    return result

input_str = input("Enter a string: ")
print("String without punctuation:", remove_punctuation(input_str))

'''
Enter a string: Hello, World! How's everything?
String without punctuation: Hello World Hows everything

'''