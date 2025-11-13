def display_unique_words(word_list):
    lowercase_words = [word.lower() for word in word_list]
    unique_words = set(lowercase_words)
    sorted_unique_words = sorted(unique_words)
    print("Unique words in alphabetical order:")
    for word in sorted_unique_words:
        print(word)

sentences = [
    "This is a test",
    "Python is fun and python is powerful",
    "OpenAI develops artificial intelligence"
]
for sentence in sentences:
    print(f"\nOriginal sentence: {sentence}")
    words = sentence.split()
    display_unique_words(words)



'''
Original sentence: This is a test
Unique words in alphabetical order:
a
is
test
this

Original sentence: Python is fun and python is powerful
Unique words in alphabetical order:
and
fun
is
powerful
python

Original sentence: OpenAI develops artificial intelligence
Unique words in alphabetical order:
artificial
develops
intelligence
openai

'''