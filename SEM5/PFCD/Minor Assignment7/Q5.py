def longest_word_length(sentence):
    return max(len(word) for word in sentence.split())

print(longest_word_length("Write a Python program to find the length"))
# Output: 7