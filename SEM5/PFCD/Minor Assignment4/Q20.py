import statistics as stats

ratings = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]

print("Ratings:", ratings)

print("\nFrequency of each rating:")
for i in range(1, 6):
    print(f"Rating {i}: {ratings.count(i)}")

minimum = min(ratings)
maximum = max(ratings)
mean = stats.mean(ratings)
median = stats.median(ratings)
mode = stats.mode(ratings)
variance = stats.variance(ratings)
std_dev = stats.stdev(ratings)


print("\nMinimum:", minimum)
print("Maximum:", maximum)
print("Range:", minimum ,"-", maximum)
print(f"Mean: {mean:.2f}")
print("Median:", median)
print("Mode:", mode)
print(f"Variance: {variance:.4f}")
print(f"Standard Deviation: {std_dev:.4f}")

'''
Ratings: [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]

Frequency of each rating:
Rating 1: 3
Rating 2: 4
Rating 3: 8
Rating 4: 2
Rating 5: 3

Minimum: 1
Maximum: 5
Range: 1 - 5
Mean: 2.90
Median: 3.0
Mode: 3
Variance: 1.5684
Standard Deviation: 1.2524

'''
