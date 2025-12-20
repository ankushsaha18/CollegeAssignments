# (a)
s = "how now brown cow"
print(s[s.find('o'):s.rfind('o')])
# Output: 'ow now brown c'
# Reason: slice from first 'o' (index 1) to last 'o' (index 14, exclusive)

# (b)
print(chr(ord('A') + 2) + chr(ord('Z') - 3))
# Output: 'CX'
# Reason: 'A'+2 → 'C', 'Z'-3 → 'X'

# (c)
s = "abc123def456ghi789"
indices = [i for i, c in enumerate(s) if c == '3']
result = s[indices[0]+1:indices[0]+4] + s[indices[0]+7:]
print(result)
# Output: 'def456ghi789'
# Reason: slices string after first '3', skips '123'

# (d)
s = "abracadabra"
print(s.replace(s[s.find('a'):s.find('r')], "XYZ"))
# Output: 'XYZracadXYZra'
# Reason: replaces substring from first 'a' to first 'r' (exclusive)

# (e)
s = "hello"
shift = 2
print("".join(chr((ord(c) - 97 + shift) % 26 + 97) for c in s))
# Output: 'jgnnq'
# Reason: Caesar cipher shifting each letter by 2

# (f)
s = "mississippi"
print("".join(sorted(set(s))))
# Output: 'imps'
# Reason: set removes duplicates, sorted arranges alphabetically
