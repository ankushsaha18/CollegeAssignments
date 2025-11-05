day, high_temperature = ('Monday', 87, 65)

numbers = [1, 2, 3, 4, 5]
numbers[10]

name = 'amanda'
name[0] = 'A'

numbers = [1, 2, 3, 4, 5]
numbers[3.4]

student_tuple = ('Amanda', 'Blue', [98, 75, 87])
student_tuple[0] = 'Ariana'

('Monday', 87, 65) + 'Tuesday'

'A' += ('B', 'C')

x = 7
del x
print(x)

numbers = [1, 2, 3, 4, 5]
numbers.index(10)

numbers = [1, 2, 3, 4, 5]
numbers.extend(6, 7, 8)

numbers = [1, 2, 3, 4, 5]
numbers.remove(10)

values = []
values.pop()

'''
(a) ValueError: too many values to unpack (expected 2)

(b) IndexError: list index out of range

(c) TypeError: 'str' object does not support item assignment

(d) TypeError: list indices must be integers or slices, not float

(e) TypeError: 'tuple' object does not support item assignment

(f) TypeError: can only concatenate tuple (not "str") to tuple

(g) TypeError: can only concatenate str (not "tuple") to str

(h) NameError: name 'x' is not defined

(i) ValueError: 10 is not in list

(j) TypeError: list.extend() takes exactly one argument (3 given)

(k) ValueError: list.remove(x): x not in list

(l) IndexError: pop from empty list

'''