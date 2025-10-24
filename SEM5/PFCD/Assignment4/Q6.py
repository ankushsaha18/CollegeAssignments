numbers = []
for i in range(10):
    num = int(input(f"Enter integer {i+1}: "))
    numbers.append(num)

search_num = int(input("Enter the number to search: "))

count = numbers.count(search_num)

if count > 0:
    print(f"{search_num} is present {count} time(s) in the list.")
else:
    print(f"{search_num} is not present in the list.")


'''
Enter integer 1: 2
Enter integer 2: 5
Enter integer 3: 4
Enter integer 4: 8
Enter integer 5: 3
Enter integer 6: 0
Enter integer 7: 6
Enter integer 8: 12
Enter integer 9: 5
Enter integer 10: 4
Enter the number to search: 4
4 is present 2 time(s) in the list.

'''