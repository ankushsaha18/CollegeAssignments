def print_ap(first_term, common_diff):
    n = 10
    for i in range(n):
        term = first_term + i * common_diff     # tn = a + (n-1)d
        print(term, end=" ")

a1 = int(input("Enter the first term: "))
d = int(input("Enter the common difference: "))
print("First 10 terms of the AP:")
print_ap(a1, d)


'''
Enter the first term: 5
Enter the common difference: 2
First 10 terms of the AP:
5 7 9 11 13 15 17 19 21 23 

'''