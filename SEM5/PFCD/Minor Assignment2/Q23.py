denominations = [100, 50, 20, 10]

amount = int(input("Enter the amount to withdraw: "))

if amount <= 0:
    print("Invalid amount!")
elif amount % 10 != 0:
    print("Amount must be a multiple of 10.")
else:
    remaining = amount
    notes_count = {}

    for denom in denominations:
        notes_count[denom] = remaining // denom
        remaining = remaining % denom

    if remaining != 0:
        print("ATM cannot dispense the exact amount with available denominations.")
    else:
        print(f"To withdraw ${amount}, you need:")
        for denom in denominations:
            if notes_count[denom] > 0:
                print(f"{notes_count[denom]} x ${denom} notes")


'''
Enter the amount to withdraw: 20130
To withdraw $20130, you need:
201 x $100 notes
1 x $20 notes
1 x $10 notes

'''