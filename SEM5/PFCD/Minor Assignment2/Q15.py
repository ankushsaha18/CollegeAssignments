num = int(input("Enter a natural number: "))

if num <= 0:
    print("Please enter a natural number")
else:
    sum_of = 0
    for i in range(1, num):
        if num % i == 0:
            sum_of += i

    if sum_of == num:
        print(f"{num} is a perfect number")
    else:
        print(f"{num} is not a perfect number")



'''
Enter a natural number: 28
28 is a perfect number

'''