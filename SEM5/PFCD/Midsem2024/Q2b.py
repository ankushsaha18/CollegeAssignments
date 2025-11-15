n = int(input("Enter a number 5 digit number: "))
if(len(str(n)) != 5):
    print("Please enter a valid 5 digit number")
else:
    for digit in str(n):
        print(digit,end="\t")