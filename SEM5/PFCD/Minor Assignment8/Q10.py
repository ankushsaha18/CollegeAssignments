def count_words_and_vowels(file1):
    try:
        with open(file1, 'r') as f:
            text = f.read()
        words = len(text.split())
        vowels = sum(1 for c in text.lower() if c in 'aeiou')
        print("Words:", words)
        print("Vowels:", vowels)
    except FileNotFoundError:
        print("File not found")

count_words_and_vowels("file1.txt")
