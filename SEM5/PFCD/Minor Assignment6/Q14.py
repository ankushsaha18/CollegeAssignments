import numpy as np

A = np.random.randint(0, 100, (5,5))
print("Array:\n", A)

counts = np.bincount(A.flatten())
print("\nCounts:")
for value, count in enumerate(counts):
    if count > 0:
        print(f"{value}: {count}")


'''
Array:
 [[44 12 65 11  8]
 [28 42 93 25 77]
 [35 38  5 98 61]
 [79 47 54  0 57]
 [25 57  7 90 69]]

Counts:
0: 1
5: 1
7: 1
8: 1
11: 1
12: 1
25: 2
28: 1
35: 1
38: 1
42: 1
44: 1
47: 1
54: 1
57: 2
61: 1
65: 1
69: 1
77: 1
79: 1
90: 1
93: 1
98: 1

'''