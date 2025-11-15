num = []
n = int(input("Enter size of list:"))
for _ in range(n):
    val = int(input("Enter element:"))
    num.append(val) 

mean = sum(num)/n
print("Mean is:", mean)

num.sort()
if n % 2 == 0:
    meadian = (num[n//2 -1] + num[n//2])/2
else:
    meadian = num[n//2]
print("Meadian is:", meadian)

from collections import Counter
freq = Counter(num)
max_freq = max(freq, key=freq.get)
print("Mode is:", max_freq)