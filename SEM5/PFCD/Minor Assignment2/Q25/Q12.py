n = int(input("Enter total lines:"))
for i in range(1,n+1):
    for j in range(i,0,-1):
        print(j,end=" ")
    print()


'''
Enter total lines:5
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 

'''