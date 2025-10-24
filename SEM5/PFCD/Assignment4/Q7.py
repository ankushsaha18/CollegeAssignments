def cumulative_list(numbers):
    cumulative = []
    total = 0
    for num in numbers:
        total += num
        cumulative.append(total)
    return cumulative


nums = []
n = int(input("Enter how many numbers you want: "))
for i in range(n):
    val = int(input(f"Enter number {i+1}: "))
    nums.append(val)

result = cumulative_list(nums)
print("Original list:", nums)
print("Cumulative list:", result)


'''
Enter how many numbers you want: 5
Enter number 1: 1  
Enter number 2: 2
Enter number 3: 3
Enter number 4: 4
Enter number 5: 5
Original list: [1, 2, 3, 4, 5]
Cumulative list: [1, 3, 6, 10, 15]

'''