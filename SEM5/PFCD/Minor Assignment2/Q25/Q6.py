n = int(input("Enter total lines:"))//2
for i in range(n):
    for j in range(n-i-1):
        print(" ", end="")
    for j in range(i+1):
        print("*", end=" ")
    print()
for i in range(n-1,0,-1):
    for j in range(n-i):
        print(" ", end="")
    for j in range(i):
        print("*", end=" ")
    print()


'''
Enter total lines:10
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

'''