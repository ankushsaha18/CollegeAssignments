import pandas as pd

s1 = [1, 2, 3, 4, 2]
s2 = [3, 4, 5, 6]

s1_series = pd.Series(s1)
s2_series = pd.Series(s2)

print("Series s1:\n", s1_series)
print("\nSeries s2:\n", s2_series)

result = s1_series[~s1_series.isin(s2_series)]

print("\nElements in s1 not present in s2:")
print(result)


'''
Series s1:
 0    1
1    2
2    3
3    4
4    2
dtype: int64

Series s2:
 0    3
1    4
2    5
3    6
dtype: int64

Elements in s1 not present in s2:
0    1
1    2
4    2
dtype: int64

'''