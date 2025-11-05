data = [1, 2, 3, 2, 3, 4, 4, 4, 5, 4, 5, 6]

# Mean
mean = sum(data) / len(data)

# Median
data.sort()
n = len(data)
if n % 2 == 0:
    median = (data[n//2 - 1] + data[n//2]) / 2
else:
    median = data[n//2]

# Mode
frequency = {}
for num in data:
    frequency[num] = frequency.get(num, 0) + 1

mode = max(frequency.values())

print("Data:", data)
print("Mean:", mean)
print("Median:", median)
print("Mode:", mode)


'''
Data: [1, 2, 2, 3, 3, 4, 4, 4, 4, 5, 5, 6]
Mean: 3.5833333333333335
Median: 4.0
Mode: 4

'''