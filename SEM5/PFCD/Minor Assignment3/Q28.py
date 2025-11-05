def shift_letters(s):
    result = ""
    for char in s:
        char_index = ord(char) + 1
        if char_index > ord('z'):
            result += chr(char_index - 26)
        else:
            result += chr(char_index)
    return result

s = input("Enter a string: ")
print(shift_letters(s))


'''
Enter a string: pythonzabc
qzuipoabcd

'''