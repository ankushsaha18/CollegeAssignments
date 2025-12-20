def is_rotational_palindrome(s):
    n = len(s)
    for i in range(n):
        r = s[i:] + s[:i]
        if r == r[::-1]:
            return True
    return False

print(is_rotational_palindrome("aab"))   # True ("aba")
