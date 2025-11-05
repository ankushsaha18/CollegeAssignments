def sort_digits(num):
    lst = [int(digit) for digit in str(num)]
    lst.sort(reverse=True)
    if(len(lst) < 3):
        print("Number should have at least 3 digits")
    else:
        print(lst[0:3])

num = int(input("Enter a number: "))
sort_digits(num)

'''
Enter a number: 8946
[9, 8, 6]

'''