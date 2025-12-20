def delete_char(s, i):
    return s[:i] + s[i+1:]


s = "Python"
i = 2
print(delete_char(s, i))

# Output: Pyhon
