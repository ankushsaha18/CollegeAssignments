nums = [1,2,3,6,5,2,3,6,7,6,4,5]
dupl = []
for i in nums:
    if nums.count(i) > 1 and i not in dupl:
        dupl.append(i)
print("The duplicate elements are:",dupl)