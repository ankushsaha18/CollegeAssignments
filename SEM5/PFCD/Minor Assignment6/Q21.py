import pandas as pd

L = ["Cry", "Apple", "Orange", "Sky", "Banana"]
s = pd.Series(L)

print("Original Series:")
print(s)

vowels = ('a','e','i','o','u','A','E','I','O','U')
contains_vowel = s[s.str.contains('[aeiouAEIOU]')]

print("\nSeries with elements that contain a vowel:")
print(contains_vowel)

starts_with_vowel = s[s.str.startswith(vowels)]

print("\nSeries with elements that start with a vowel:")
print(starts_with_vowel)


'''
Original Series:
0       Cry
1     Apple
2    Orange
3       Sky
4    Banana
dtype: object

Series with elements that contain a vowel:
1     Apple
2    Orange
4    Banana
dtype: object

Series with elements that start with a vowel:
1     Apple
2    Orange
dtype: object

'''