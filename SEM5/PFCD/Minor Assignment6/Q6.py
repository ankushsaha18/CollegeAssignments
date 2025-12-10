import numpy as np

A = np.array([2**i for i in range(6)]).reshape(2,3)
print("Original array A:\n", A)
B = A.flatten()
print("\nFlatten result:\n", B)
C = A.ravel()
print("\nRavel result:\n", C)
print("\nOriginal array A after ravel:\n", A)


'''
Original array A:
 [[ 1  2  4]
 [ 8 16 32]]

Flatten result:
 [ 1  2  4  8 16 32]

Ravel result:
 [ 1  2  4  8 16 32]

Original array A after ravel:
 [[ 1  2  4]
 [ 8 16 32]]

'''