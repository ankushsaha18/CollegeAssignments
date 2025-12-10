import numpy as np

arr = np.arange(0,4).reshape(2,2)
print("Original Array:\n", arr)

# (a) Cube of every element
cubed_arr = np.power(arr, 3)
print("\nCubed Array:\n", cubed_arr)

# (b) Add 7 to every element
added_arr = arr + 7
print("\nArray after adding 7:\n", added_arr)

# (c) Multiply every element by 2
multiplied_arr = arr * 2
print("\nArray after multiplying by 2:\n", multiplied_arr)


'''
Original Array:
 [[0 1]
 [2 3]]

Cubed Array:
 [[ 0  1]
 [ 8 27]]

Array after adding 7:
 [[ 7  8]
 [ 9 10]]

Array after multiplying by 2:
 [[0 2]
 [4 6]]

'''