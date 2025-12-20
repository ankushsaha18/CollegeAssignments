filename = "sample.txt"

with open(filename, "r") as file:
    text = file.read()
    words = text.split()

print(f"The file '{filename}' contains {len(words)} words.")
