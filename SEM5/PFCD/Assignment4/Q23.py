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

for bar, pct in zip(bars, percentages):
    plt.text(bar.get_x() + bar.get_width()/2, bar.get_height(), f'{pct:.0f}%', ha='center', va='bottom')

plt.xlabel('Response')
plt.ylabel('Frequency')
plt.title('Response Frequencies and Percentages')
plt.xticks(keys)
plt.show()