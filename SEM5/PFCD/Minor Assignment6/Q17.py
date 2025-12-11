import numpy as np

arr = np.random.randint(0, 100, size=(4, 4))
print("Original array:")
print(arr)
sorted_arr = np.sort(arr, axis=0)
print("\nColumn-wise sorted array:")
print(sorted_arr)



'''
Original array:
[[40 88 88 19]
 [16 50 12 92]
 [43  1 16  6]
 [44 74 64  7]]

Column-wise sorted array:
[[16  1 12  6]
 [40 50 16  7]
 [43 74 64 19]
 [44 88 88 92]]

'''