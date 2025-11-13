def unique_pairs(words):
    filtered = [w for w in words if len(w) >= 4]
    pairs = set()
    for i in range(len(filtered)):
        for j in range(i + 1, len(filtered)):
            w1 = filtered[i]
            w2 = filtered[j]

            if set(w1).isdisjoint(set(w2)):
                pairs.add(tuple(sorted((w1, w2))))

    return sorted(pairs)

words = ["apple", "dogs", "cat", "bird", "fish", "zebra", "lion"]
print(unique_pairs(words))

'''
[('apple', 'bird'), ('apple', 'dogs'), ('apple', 'fish'), ('dogs', 'zebra'), ('fish', 'zebra'), ('lion', 'zebra')]

'''