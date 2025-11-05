def can_palindrome(s):
    char_count = {}
    for ch in s:
        char_count[ch] = char_count.get(ch, 0) + 1
    for ch in char_count:
        if char_count[ch] % 2 != 0:
            return False
    return True

s = input("Enter a string: ")
print(can_palindrome(s))


'''
Enter a string: aabb 
True

'''