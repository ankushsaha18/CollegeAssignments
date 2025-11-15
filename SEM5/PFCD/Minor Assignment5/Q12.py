sentence = input("Enter a sentence: ").lower()
words = sentence.split()
word_count = {}
for word in words:
    word_count[word] = word_count.get(word, 0) + 1
duplicates = [word for word,count in word_count.items() if count > 1]
print("Duplicate words and their counts:", duplicates)


'''
Enter a sentence: Hello Here Hello i
Duplicate words and their counts: {'hello': 2}

'''