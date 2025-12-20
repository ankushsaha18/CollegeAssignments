import pandas as pd

df = pd.read_csv("titanic1.csv")

longest_name_row = df.loc[df["Name"].str.len().idxmax()]

print("Passenger with the longest name:")
print(longest_name_row)
