n = int(input("Enter total lines:"))
for i in range(n,0,-1):
    for j in range(i):
        print(j,end=" ")
    print()


'''
Enter total lines:6
0 1 2 3 4 5 
0 1 2 3 4 
0 1 2 3 
0 1 2 
0 1 
0 

'''