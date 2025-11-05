def plaindrome_check(s):
    i=0
    j=len(s)-1
    while i<j:
        if s[i]!=s[j]:
            return False
        i+=1
        j-=1
    return True

s = input("Enter a string: ")
print("Is palindrome:", plaindrome_check(s))

'''
Enter a string: racecar
Is palindrome: True

'''