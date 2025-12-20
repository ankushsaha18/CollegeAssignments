def check_symmetric(s):
    mid = len(s) // 2
    if len(s) % 2 == 0:
        return "Symmetric" if s[:mid] == s[mid:] else "Asymmetric"
    else:
        return "Asymmetric"


s = "khokho"
print(check_symmetric(s))

# Output: Symmetric
