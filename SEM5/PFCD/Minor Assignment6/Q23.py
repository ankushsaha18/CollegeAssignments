import pandas as pd

# (a)
data = {
    'Maxine': [72.1, 76.3, 68.4],
    'James' : [70.0, 75.5, 69.2],
    'Amanda': [71.4, 77.0, 67.8]
}
temperatures = pd.DataFrame(data)
print("Original DataFrame (default index):")
print(temperatures)
print("\n")

# (b)
idx = ['Morning', 'Afternoon', 'Evening']
temperatures = pd.DataFrame(data, index=idx)
print("Temperatures with custom index:")
print(temperatures)
print("\n")

# (c)
maxine_col = temperatures['Maxine']
print("Column - Maxine:")
print(maxine_col)
print("\n")

# (d)
morning_row = temperatures.loc['Morning']
print("Row - Morning:")
print(morning_row)
print("\n")

# (e)
morning_evening = temperatures.loc[['Morning', 'Evening']]
print("Rows - Morning and Evening:")
print(morning_evening)
print("\n")

# (f)
amanda_maxine = temperatures[['Amanda', 'Maxine']]
print("Columns - Amanda and Maxine:")
print(amanda_maxine)
print("\n")

# (g)
subset = temperatures.loc[['Morning', 'Afternoon'], ['Amanda', 'Maxine']]
print("Subset - Amanda & Maxine for Morning and Afternoon:")
print(subset)
print("\n")

# (h)
print("Descriptive statistics (temperatures.describe()):")
print(temperatures.describe())
print("\n")

# (i)
print("Transpose (temperatures.T):")
print(temperatures.T)
print("\n")

# (j)
sorted_cols = temperatures.sort_index(axis=1)
print("Columns sorted alphabetically:")
print(sorted_cols)
print("\n")



'''
Original DataFrame (default index):
   Maxine  James  Amanda
0    72.1   70.0    71.4
1    76.3   75.5    77.0
2    68.4   69.2    67.8


Temperatures with custom index:
           Maxine  James  Amanda
Morning      72.1   70.0    71.4
Afternoon    76.3   75.5    77.0
Evening      68.4   69.2    67.8


Column - Maxine:
Morning      72.1
Afternoon    76.3
Evening      68.4
Name: Maxine, dtype: float64


Row - Morning:
Maxine    72.1
James     70.0
Amanda    71.4
Name: Morning, dtype: float64


Rows - Morning and Evening:
         Maxine  James  Amanda
Morning    72.1   70.0    71.4
Evening    68.4   69.2    67.8


Columns - Amanda and Maxine:
           Amanda  Maxine
Morning      71.4    72.1
Afternoon    77.0    76.3
Evening      67.8    68.4


Subset - Amanda & Maxine for Morning and Afternoon:
           Amanda  Maxine
Morning      71.4    72.1
Afternoon    77.0    76.3


Descriptive statistics (temperatures.describe()):
          Maxine      James     Amanda
count   3.000000   3.000000   3.000000
mean   72.266667  71.566667  72.066667
std     3.952636   3.429772   4.636090
min    68.400000  69.200000  67.800000
25%    70.250000  69.600000  69.600000
50%    72.100000  70.000000  71.400000
75%    74.200000  72.750000  74.200000
max    76.300000  75.500000  77.000000


Transpose (temperatures.T):
        Morning  Afternoon  Evening
Maxine     72.1       76.3     68.4
James      70.0       75.5     69.2
Amanda     71.4       77.0     67.8


Columns sorted alphabetically:
           Amanda  James  Maxine
Morning      71.4   70.0    72.1
Afternoon    77.0   75.5    76.3
Evening      67.8   69.2    68.4

'''