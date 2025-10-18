n = int(input("Enter total lines:"))
for i in range(n):
    for j in range(i + 1):
        print("*", end="")
    print()


'''
Enter total lines:4
*
**
***
****

'''