numbers = [10, 3, 7, 1, 9, 4, 2, 8, 5, 6]

lst = list(filter(lambda x: x % 2 == 0, map(lambda x: x * 2, numbers)))
print(lst)

'''
Output: [20, 6, 14, 2, 18, 8, 4, 16, 10, 12]

Every number is doubled due to map function at first, 
and doubling always produces an even number, so the filter keeps everything.

'''