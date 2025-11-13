def analyze_sets(list1, list2):
    set1 = set(list1)
    set2 = set(list2)
    sym_diff = set1 ^ set2 

    modified = list(map(lambda x: x*2 if x%2 == 0 else x+5,sym_diff))
    return sorted(modified)

list1 = [1, 2, 3, 4, 5, 6]
list2 = [4, 5, 6, 7, 8, 9]
result = analyze_sets(list1, list2)
print(result)


'''
[4, 6, 8, 12, 14, 16]

'''