import pandas as pd
import numpy as np

# (a)
s_a = pd.Series([7, 11, 13, 17])
print("(a) Series:")
print(s_a)

# (b)
s_b = pd.Series([100.0] * 5)
print("\n(b) Series of five elements all 100.0:")
print(s_b)

# (c)
s_c = pd.Series(np.random.randint(0, 101, size=20))
print("\n(c) Random Series:")
print(s_c)
print("\nDescriptive Statistics:")
print(s_c.describe())

# (d)
temperatures = pd.Series(
    [98.6, 98.9, 100.2, 97.9],
    index=['Julie', 'Charlie', 'Sam', 'Andrea']
)
print("\n(d) Temperatures Series with custom index:")
print(temperatures)


# (e)
temp_dict = {
    'Julie': 98.6,
    'Charlie': 98.9,
    'Sam': 100.2,
    'Andrea': 97.9
}
s_e = pd.Series(temp_dict)
print("\n(e) Series created from dictionary:")
print(s_e)



'''
(a) Series:
0     7
1    11
2    13
3    17
dtype: int64

(b) Series of five elements all 100.0:
0    100.0
1    100.0
2    100.0
3    100.0
4    100.0
dtype: float64

(c) Random Series:
0      61
1      36
2      94
3      97
4      32
5      24
6      44
7      77
8       3
9     100
10     34
11      9
12     58
13     97
14     32
15     63
16     31
17     89
18     62
19     71
dtype: int64

Descriptive Statistics:
count     20.000000
mean      55.700000
std       30.310846
min        3.000000
25%       32.000000
50%       59.500000
75%       80.000000
max      100.000000
dtype: float64

(d) Temperatures Series with custom index:
Julie       98.6
Charlie     98.9
Sam        100.2
Andrea      97.9
dtype: float64

(e) Series created from dictionary:
Julie       98.6
Charlie     98.9
Sam        100.2
Andrea      97.9
dtype: float64

'''