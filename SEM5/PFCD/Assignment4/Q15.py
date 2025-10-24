import random

matrix = [[random.randint(0, 1) for _ in range(4)] for _ in range(4)]

for row in matrix:
    print(''.join(str(x) for x in row))

row_sums = [sum(row) for row in matrix]
largest_row = row_sums.index(max(row_sums))

col_sums = [sum(matrix[row][col] for row in range(4)) for col in range(4)]
largest_col= col_sums.index(max(col_sums))

print("\nThe largest row index:", largest_row)
print("The largest column index:", largest_col)


'''
0001
1100
0011
1111

The largest row index: 3
The largest column index: 3

'''