import numpy as np

A = np.arange(1, 16).reshape(3, 5)
print("A =\n", A)

# (a)
row2 = A[2, :]
print("\nRow 2 of A:\n", row2)

# (b)
col3 = A[:, 4]
print("\nColumn 5 of A:\n", col3)

# (c)
rows_0_1 = A[0:2, : ]
print("\nRows 0 and 1 of A:\n", rows_0_1)

# (d)
cols_2_4 = A[:, 2:5]
print("\nColumns 2 to 4 of A:\n", cols_2_4)

# (e)
elem_1_4 = A[1, 4]
print("\nElement at (1,4) of A:\n", elem_1_4)

# (f)
sub = A[1:3, [0, 2, 4]]
print("\nAll elements from rows 1 and 2 that are in columns 0, 2, and 4:\n", sub)



'''
A =
 [[ 1  2  3  4  5]
 [ 6  7  8  9 10]
 [11 12 13 14 15]]

Row 2 of A:
 [11 12 13 14 15]

Column 5 of A:
 [ 5 10 15]

Rows 0 and 1 of A:
 [[ 1  2  3  4  5]
 [ 6  7  8  9 10]]

Columns 2 to 4 of A:
 [[ 3  4  5]
 [ 8  9 10]
 [13 14 15]]

Element at (1,4) of A:
 10

All elements from rows 1 and 2 that are in columns 0, 2, and 4:
 [[ 6  8 10]
 [11 13 15]]

'''