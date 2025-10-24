def generate_multiples(n):
    result = []
    for i in range(1, n + 1):
        multiples = [i * j for j in range(1, 6)] 
        result.append(multiples)
    return result


n = int(input("Enter the value of n: "))

lists = generate_multiples(n)
print("List of multiples:")
print(lists)


'''
Enter the value of n: 5
List of multiples:
[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15], [4, 8, 12, 16, 20], [5, 10, 15, 20, 25]]

'''