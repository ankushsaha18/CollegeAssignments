import numpy as np

arr1 = np.arange(2,19,2).reshape(3,3)
arr2 = np.arange(9,0,-1).reshape(3,3)
print("Array 1:\n", arr1)
print("Array 2:\n", arr2)
arr_mul = arr1 * arr2
print(arr_mul)


'''
Array 1:
 [[ 2  4  6]
 [ 8 10 12]
 [14 16 18]]
Array 2:
 [[9 8 7]
 [6 5 4]
 [3 2 1]]
 
[[18 32 42]
 [48 50 48]
 [42 32 18]]

'''