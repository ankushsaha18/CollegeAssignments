tuple_list = [(1, 2), (3, 4, 5), (6,), (7, 8, 9), (10, 11)]
print("Original list:", tuple_list)

K = int(input("Enter K: "))
filtered_list = [t for t in tuple_list if len(t) != K]
print(f"List after removing tuples of length {K}:", filtered_list)


'''
Original list: [(1, 2), (3, 4, 5), (6,), (7, 8, 9), (10, 11)]
Enter K: 3
List after removing tuples of length 3: [(1, 2), (6,), (10, 11)]

'''