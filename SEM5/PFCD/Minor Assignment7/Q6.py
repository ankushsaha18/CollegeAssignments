def next_vowel(s):
    v = "aeiou"
    return ''.join(v[(v.index(c)+1)%5] if c in v else c for c in s)

print(next_vowel("education")) 

# Output: "idacetoun"