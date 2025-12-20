def unique_sorted_chars(s):
    return ''.join(sorted(set(s)))

print(unique_sorted_chars("aabbbccccddddd")) 

# Output: abcd