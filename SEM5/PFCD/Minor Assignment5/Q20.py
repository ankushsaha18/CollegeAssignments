sample_dict = {
    'person1': {'name': 'Bezos', 'net worth': 21880},
    'person2': {'name': 'Elon', 'net worth': 31570},
    'person3': {'name': 'Mukesh', 'net worth': 965}
}
for person in sample_dict.values():
    if person['name'] == 'Mukesh':
        person['net worth'] = 9650

print(sample_dict)


'''
{'person1': {'name': 'Bezos', 'net worth': 21880},
'person2': {'name': 'Elon', 'net worth': 31570}, 
'person3': {'name': 'Mukesh', 'net worth': 9650}}

'''