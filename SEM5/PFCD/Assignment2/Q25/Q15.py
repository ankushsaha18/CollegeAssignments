n = int(input("Enter total lines:"))
for i in range(1,n+1):
    for j in range(n,0,-1):
        if j <= i:
            print(j,end=" ")
        else:
            print(" ",end=" ")
    for j in range(2,i+1):
        print(j,end=" ")
    print()


'''
Enter total lines:5
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

'''