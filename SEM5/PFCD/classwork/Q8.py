quote = "In the middle of difficulty lies opportunity"

w = len(quote.split())
print(w)

q2 = ""
for c in quote:
    if c not in 'aeiouAEIOU':
        q2 += c

print(q2)

q3 = quote
q3 = q3.replace("difficulty","challenge")
q3 = q3.replace("opportunity","possibility")

print(q3)

q4 = ' '.join(sorted(quote.split(),key=len))
print(q4)