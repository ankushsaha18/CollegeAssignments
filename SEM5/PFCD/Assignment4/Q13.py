def sort_by_second(tuples_list):
    return sorted(tuples_list, key=lambda x: x[1])

data = [(1, 5), (3, 2), (4, 8), (2, 1)]
sorted_data = sort_by_second(data)
print("Original list:", data)
print("Sorted by second element:", sorted_data)


'''
Original list: [(1, 5), (3, 2), (4, 8), (2, 1)]
Sorted by second element: [(2, 1), (3, 2), (1, 5), (4, 8)]

'''