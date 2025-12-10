import numpy as np

def median(arr):
    return np.median(arr)

def mode(arr):
    values, counts = np.unique(arr, return_counts=True)
    return values[np.argmax(counts)]


C = np.array([[[7, 8, 9],
               [7, 7, 6]],
              [[5, 7, 6],
               [7, 9, 5]]])

print("Array C:\n", C)
print("Median:", median(C))
print("Mode:", mode(C))


'''
Array C:
 [[[7 8 9]
  [7 7 6]]

 [[5 7 6]
  [7 9 5]]]
Median: 7.0
Mode: 7

'''