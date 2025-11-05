def is_armstrong(num):
    temp = num
    power = len(str(num))
    sum = 0
    while temp > 0:
        digit = temp % 10
        sum += digit ** power
        temp //= 10
    return sum == num

num = int(input("Enter a number: "))
print(is_armstrong(num))


'''
Enter a number: 1634
True

'''