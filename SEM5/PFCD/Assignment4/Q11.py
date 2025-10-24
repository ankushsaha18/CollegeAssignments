M = int(input("Enter M: "))
N = int(input("Enter N: "))

matrix = []
for i in range(M):
    row = []
    for j in range(N):
        val = input(f"Enter value for element ({i+1}, {j+1}): ")
        row.append(val)
    matrix.append(row)

print("\nThe MxN list in tabular format:")
for row in matrix:
    print(" ".join(row))

'''
Enter M: 3
Enter N: 3
Enter value for element (1, 1): 1
Enter value for element (1, 2): 2
Enter value for element (1, 3): 3
Enter value for element (2, 1): 4
Enter value for element (2, 2): 5
Enter value for element (2, 3): 6
Enter value for element (3, 1): 7
Enter value for element (3, 2): 8
Enter value for element (3, 3): 9

The MxN list in tabular format:
1 2 3
4 5 6
7 8 9

'''
