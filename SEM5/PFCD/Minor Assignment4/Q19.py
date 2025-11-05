import copy

def demonstrate_copy():
    original = [['Shallow', 2, 3], [4, 5, 6]]
    print("Original List:", original)

    shallow_copy = copy.copy(original)

    deep_copy = copy.deepcopy(original)
 
    shallow_copy[0][0] = 'Changed in Shallow'
    deep_copy[0][0] = 1
    deep_copy[1][0] = 'Deep'

    print("\nAfter modifications:")
    print("Original List:", original)
    print("Shallow Copy:", shallow_copy)
    print("Deep Copy:", deep_copy)

demonstrate_copy()


'''
Original List: [['Shallow', 2, 3], [4, 5, 6]]

After modifications:
Original List: [['Changed in Shallow', 2, 3], [4, 5, 6]]
Shallow Copy: [['Changed in Shallow', 2, 3], [4, 5, 6]]
Deep Copy: [[1, 2, 3], ['Deep', 5, 6]]

'''