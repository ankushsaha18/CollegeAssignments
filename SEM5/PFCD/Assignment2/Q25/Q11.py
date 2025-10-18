n = int(input("Enter total lines:"))
for i in range(n):
    for j in range(i+1):
        print(2*i+1,end=" ")
    print()


'''
Enter total lines:5
1 
3 3 
5 5 5 
7 7 7 7 
9 9 9 9 9 

'''