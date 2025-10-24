def sum_inner_tuples(tuples_of_tuples):
    total_sum = 0
    for inner in tuples_of_tuples:
        for element in inner:
            if isinstance(element, (int, float)):
                total_sum += element
    print("Sum of all numeric elements:", total_sum)

data = ((1, 2, 3), (4, 5, 6), (7, 8, 9))
sum_inner_tuples(data)


'''
Sum of all numeric elements: 45

'''