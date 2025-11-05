n = int(input("Enter total lines:"))
count = 0
for i in range(n):
    for j in range(i+1):
        print(chr(65+count),end=" ")
        count += 1
    print()


'''
Enter total lines:7
A 
B C 
D E F 
G H I J 
K L M N O 
P Q R S T U 
V W X Y Z [ \ 

'''