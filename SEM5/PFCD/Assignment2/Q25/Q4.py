n = int(input("Enter total lines:"))
for i in range(n,0,-1):
    for j in range(i):
        print("*", end="")
    print()


'''
Enter total lines:4
****
***
**
*

'''