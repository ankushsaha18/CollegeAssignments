def reverse_middle_half(s):
    n = len(s)
    start = n // 4
    end = n - start
    return s[:start] + s[start:end][::-1] + s[end:]


print(reverse_middle_half("abcdefgh"))

# Output: abfedcgh