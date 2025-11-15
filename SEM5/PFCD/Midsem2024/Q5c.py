import copy
list_a = [1, 2, [3, 4]]
list_b = list_a.copy()
list_b[2][0] = 10
print("List A:", list_a)
print("List B:", list_b)

list_c = copy.deepcopy(list_a)
list_c[2][0] = 20
print("List A", list_a)
print("List C", list_c)
