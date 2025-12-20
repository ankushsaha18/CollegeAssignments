import pandas as pd

df = pd.read_csv("titanic.csv")

print("Fare Statistics:")
print(df["Fare"].describe())

under_18 = df[df["Age"] < 18]["Name"]

print("\nPassengers under 18 years old:")
for name in under_18:
    print(name)
