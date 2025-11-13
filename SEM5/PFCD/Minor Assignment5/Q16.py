s1={10, 20, 30}
s2={5, 10, 15, 20}

print("(a) ",s1-s2)

print("(b) ",s1.symmetric_difference(s2))   # (A | B)-(A & B)

print("(c) ",s1.union(s2))

print("(d) ",s1.intersection(s2))


'''
(a)  {30}
(b)  {5, 30, 15}
(c)  {20, 5, 10, 30, 15}
(d)  {10, 20}

'''