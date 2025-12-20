def f(s):
    return s[:1] + ''.join('*' if s[i] == s[i-1] else s[i] for i in range(1, len(s)))

print(f("balloon"))

# Output: "bal*o*n"