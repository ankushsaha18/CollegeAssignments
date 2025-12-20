def count_vowels_consonants(s):
    vowels = "aeiouAEIOU"
    v = c = 0
    for ch in s:
        if ch.isalpha():
            if ch in vowels:
                v += 1
            else:
                c += 1
    return v, c

print(count_vowels_consonants("Hello World"))
# Output: (3, 7)