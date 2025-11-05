def sum_column(matrix, col_index):
    total = 0
    for row in matrix:
        total += row[col_index]
    return total

matrix = []
print("Enter a 3-by-4 matrix row by row:")
for i in range(3):
    row = list(map(float, input().split())) 
    matrix.append(row)

for col in range(4):
    col_sum = sum_column(matrix, col)
    print(f"Sum of column {col+1}: {col_sum}")



'''
Enter a 3-by-4 matrix row by row:
1.5 2 3 4
5.5 6 7 8
9.5 1 3 1
Sum of column 1: 16.5
Sum of column 2: 9.0
Sum of column 3: 13.0
Sum of column 4: 13.0

'''