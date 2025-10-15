import math

v1 = math.e ** math.pi
v2 = math.pi ** math.e

print("e^π =", v1)
print("π^e =", v2)

if v1 > v2:
    print("ok")
else:
    print("ok anyway")


'''

    e^π = 23.140692632779263
    π^e = 22.45915771836104
    ok
'''