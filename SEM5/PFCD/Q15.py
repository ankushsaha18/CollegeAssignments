
p = 1000
r = 0.12

years = [10, 20, 30]

for n in years:
    a = p * (1 + r) ** n
    print("After ",n," years: Rs. ",a)

'''
    After  10  years: Rs.  3105.8482083442123
    After  20  years: Rs.  9646.293093274951
    After  30  years: Rs.  29959.92212091116
'''