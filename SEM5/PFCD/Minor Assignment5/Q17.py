A = {'red', 'green', 'blue'}
B = {'cyan', 'green', 'blue', 'magenta', 'red'}

print("Set A =", A)
print("Set B =", B)

print("\n=== a) Comparison Operators ===")
print("A == B:", A == B)
print("A != B:", A != B)
print("A < B :", A < B)  
print("A <= B:", A <= B) 
print("A > B :", A > B)  
print("A >= B:", A >= B) 

print("\n=== b) Set Operations ===")
print("Union (A | B):", A | B)
print("Intersection (A & B):", A & B)
print("Difference (A - B):", A - B)
print("Difference (B - A):", B - A)
print("Symmetric Difference (A ^ B):", A ^ B)



'''
Set A = {'blue', 'green', 'red'}
Set B = {'blue', 'red', 'green', 'magenta', 'cyan'}

=== a) Comparison Operators ===
A == B: False
A != B: True
A < B : True
A <= B: True
A > B : False
A >= B: False

=== b) Set Operations ===
Union (A | B): {'red', 'green', 'magenta', 'blue', 'cyan'}
Intersection (A & B): {'blue', 'green', 'red'}
Difference (A - B): set()
Difference (B - A): {'magenta', 'cyan'}
Symmetric Difference (A ^ B): {'magenta', 'cyan'}

'''