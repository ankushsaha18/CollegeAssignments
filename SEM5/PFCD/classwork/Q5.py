nums = [1,2,3,4,5,6,7,8]

largest = nums[0]
sec_largest = nums[0]

for i in nums:
    if i >= largest:
        sec_largest = largest
        largest = i
    elif i < largest and i >= sec_largest:
        sec_largest = i

print(sec_largest)