import pandas as pd

df = pd.DataFrame({
    'A': [10, 20, 30, 40],
    'B': [5, 6, 7, 8]
})
print("Original DataFrame:")
print(df)

first_col_series = df.iloc[:, 0]

print("\nFirst column as a Series:")
print(first_col_series)
print("\nType:", type(first_col_series))


'''
Original DataFrame:
    A  B
0  10  5
1  20  6
2  30  7
3  40  8

First column as a Series:
0    10
1    20
2    30
3    40
Name: A, dtype: int64

Type: <class 'pandas.core.series.Series'>

'''