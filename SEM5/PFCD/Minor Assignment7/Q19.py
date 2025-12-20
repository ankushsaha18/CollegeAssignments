quote = "The quick brown fox jumps over the lazy dog"

print("a)", quote.upper())
print("b)", quote[::-1])
print("c)", quote[4:19])
print("d)", quote.replace("fox", "cat"))
print("e)", quote.count("o"))
print("f)", quote.startswith("The"))
print("g)", "brown" in quote)
print("h)", quote.islower())


'''
a) THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
b) god yzal eht revo spmuj xof nworb kciuq ehT
c) quick brown fox
d) The quick brown cat jumps over the lazy dog
e) 4
f) True
g) True
h) False

'''