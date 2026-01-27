nums = [1,2,3,2,4,9,5,4,7,8,1]
ans = []
s = set()

for i in nums:
    if i not in s:
        ans.append(i)
        s.add(i)

print(ans)