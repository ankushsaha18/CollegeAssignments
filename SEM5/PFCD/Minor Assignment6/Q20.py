import pandas as pd

s = pd.Series([1, 1, 3, 7, 88, 12, 88, 23, 3, 1, 9, 0])

min_index = s.idxmin()
max_index = s.idxmax()

print("Index of smallest value:", min_index)
print("Index of largest value:", max_index)


'''
Index of smallest value: 11
Index of largest value: 4

'''