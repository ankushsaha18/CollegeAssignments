import numpy as np

arr = np.array([[20,5,4,6,2],
               [10,4,2,9,1]])

prod_sales = np.sum(arr,axis=1)

highest = np.argmax(prod_sales)

print(prod_sales)
print(highest)