import numpy as np
arr = np.array([6,9,5,1,7,5,1,0,1,5,5,0,8,9,0,7,0,7,6,5,1,1,9,5,3,8,7,9,6,3,4,5,9,7,2,7,0,2,2,6])

unique, counts = np.unique(arr, return_counts=True)
freq = dict(zip(unique, counts))
print(freq)
print("Most frequent:", unique[np.argmax(counts)])


'''
0: 5, 1: 5, 2: 3, 3: 2, 4: 1, 5: 7, 6: 4, 7: 6, 8: 2, 9: 5}
Most frequent: 5

'''