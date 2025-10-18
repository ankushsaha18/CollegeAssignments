n = int(input("Enter total lines:"))
for i in range(n):
    for j in range(n-i-1):
        print(" ", end="")
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