meal = float(input("Enter the cost of the meal: "))

tax = meal * 0.05 # 5% tax
tip = meal * 0.18 # 18% tip

grand_total = meal + tax + tip

print(f"Tax amount: Rs. {tax:.2f}")
print(f"Tip amount: Rs. {tip:.2f}")
print(f"Grand total: Rs. {grand_total:.2f}")


'''
    Enter the cost of the meal: 989.50
    Tax amount: Rs. 49.48
    Tip amount: Rs. 178.11
    Grand total: Rs. 1217.08
'''