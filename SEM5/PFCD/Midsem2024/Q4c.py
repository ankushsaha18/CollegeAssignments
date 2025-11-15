from functools import reduce
ans = reduce(lambda x,y: x+y,map(lambda x: x**3,filter(lambda x: x%2 != 0,range(1,102))))
print(ans)