def substr_with_freq(s, k):
    i = 0
    while i < len(s):
        j = i
        while j < len(s) and s[j] == s[i]:
            j += 1
        if j - i == k:
            print(s[i:j])
        i = j

substr_with_freq("aabbbccccddddd", 3)


# output: bbb