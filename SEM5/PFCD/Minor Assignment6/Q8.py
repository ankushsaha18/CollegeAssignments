import numpy as np

A = np.linspace(1.1, 6.6, 6).reshape(2,3)
print("Original (float) array:\n", A)
B = A.astype(int)
print("\nInteger array:\n", B)


'''
Original (float) array:
 [[1.1 2.2 3.3]
 [4.4 5.5 6.6]]

Integer array:
 [[1 2 3]
 [4 5 6]]

'''