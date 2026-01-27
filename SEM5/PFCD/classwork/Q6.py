import numpy as np

arr = np.array([23,19,21,20,24])

avg = np.mean(arr)
count = np.sum(arr > avg)

print(avg)
print(count)
