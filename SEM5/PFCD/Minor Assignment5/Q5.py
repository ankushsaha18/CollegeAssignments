tlds = {'Canada': 'ca', 'United States': 'us', 'Mexico': 'mx'}

print("(a)", 'Canada' in tlds)

print("\n(b)", 'France' in tlds)

print("\n(c) Country and TLDs:")
print("---------------------")
print(f"{'Country':<15} {'TLD':<5}")
for country, domain in tlds.items():
    print(f"{country:<15} {domain:<5}")

tlds['Sweden'] = 'sw'
print("\n(d) After adding Sweden with incorrect TLD:")
print(tlds)

tlds['Sweden'] = 'se'
print("\n(e) After correcting Sweden's TLD:")
print(tlds)

reversed_tlds = {v: k for k, v in tlds.items()}
print("\n(f) Reversed dictionary (TLD → Country):")
print(reversed_tlds)


'''
(a) True

(b) False

(c) Country and TLDs:
Country         TLD  
---------------------
Canada          ca   
United States   us   
Mexico          mx   

(d) After adding Sweden with incorrect TLD:
{'Canada': 'ca', 'United States': 'us', 'Mexico': 'mx', 'Sweden': 'sw'}

(e) After correcting Sweden's TLD:
{'Canada': 'ca', 'United States': 'us', 'Mexico': 'mx', 'Sweden': 'se'}

(f) Reversed dictionary (TLD → Country):
{'ca': 'Canada', 'us': 'United States', 'mx': 'Mexico', 'se': 'Sweden'}

'''