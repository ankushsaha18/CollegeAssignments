address = 'B-6, Lodhi road, Delhi'
list1 = [1, 2, 3]
list2 = ['a', 1, 'z', 26, 'd', 4]
tuple1 = ('a', 'e', 'i', 'o', 'u')
tuple2 = ([2,4,6,8], [3,6,9], [4,8], 5)


list1[3] = 4 # IndexError: list assignment index out of range

print(list1 * 2) # [1, 2, 3, 1, 2, 3]

print(min(list2)) # TypeError: '<' not supported between instances of 'int' and 'str'

print(max(list1)) # 3

print(list(address)) # ['B', '-', '6', ',', ' ', 'L', 'o', 'd', 'h', 'i', ' ', 'r', 'o', 'a', 'd', ',', ' ', 'D', 'e', 'l', 'h', 'i']

list2.extend(['e', 5])
print(list2)        # ['a', 1, 'z', 26, 'd', 4, 'e', 5]

list2.append(['e', 5])
print(list2)        # ['a', 1, 'z', 26, 'd', 4, ['e', 5]]  

names = ['rohan', 'mohan', 'gita']
names.sort(key=len)
print(names)        # ['gita', 'rohan', 'mohan']

list3 = [(x * 2) for x in range(1, 11)]
print(list3)        # [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

del list3[1:]
print(list3)        # [2]

list4 = [x + y for x in range(1, 5) for y in range(1, 5)]
print(list4)        # [2, 3, 4, 5, 3, 4, 5, 6, 4, 5, 6, 7, 5, 6, 7, 8]

tuple2[3] = 6       # TypeError: 'tuple' object does not support item assignment

tuple2.append(5)    # AttributeError: 'tuple' object has no attribute 'append'  

t1 = tuple2 + (5)   # TypeError: can only concatenate tuple (not "int") to tuple 

', '.join(tuple1)    # 'a, e, i, o, u'

list(zip(['apple', 'orange'], ('red', 'orange'))) # [('apple', 'red'), ('orange', 'orange')]

