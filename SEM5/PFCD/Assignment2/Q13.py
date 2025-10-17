position = input("Enter the position: ")

if len(position) != 2 or position[0] not in "abcdefgh" or position[1] not in "12345678":
    print("Invalid position!")
else:
    column = position[0]
    row = int(position[1])


    if (ord(column) + row) % 2 == 0:
        print(f"The square {position} is Black.")
    else:
        print(f"The square {position} is White.")


'''
Enter the position: h5
The square h5 is White.

'''