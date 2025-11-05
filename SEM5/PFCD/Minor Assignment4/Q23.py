import matplotlib.pyplot as plt

responses = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 5]

freq = {}
for r in responses:
    freq[r] = freq.get(r, 0) + 1

keys = sorted(freq.keys())
values = [freq[k] for k in keys]


total = len(responses)
percentages = [v / total * 100 for v in values]

bars = plt.bar(keys, values)

for i in range(len(bars)):
    plt.text(keys[i], values[i], f'{percentages[i]:.1f}%', ha='center', va='bottom')

plt.xlabel('Response')
plt.ylabel('Frequency')
plt.title('Response Frequencies and Percentages')
plt.xticks(keys)
plt.show()