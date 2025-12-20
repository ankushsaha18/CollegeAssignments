s = input()
for w in s.split():
    if w.startswith('b') and w.endswith('d'):
        print(w)


'''
bad bird bed bud band

bad
bird
bed
bud
band

'''