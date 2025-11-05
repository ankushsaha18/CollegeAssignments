def rotate(x, y, z):
    return (z, x, y)

a, b, c = 'Doug', 22, 1984

for i in range(3):
    a, b, c = rotate(a, b, c)
    print(f"After call {i+1}: a = {a}, b = {b}, c = {c}")


'''
After call 1: a = 1984, b = Doug, c = 22
After call 2: a = 22, b = 1984, c = Doug
After call 3: a = Doug, b = 22, c = 1984

'''