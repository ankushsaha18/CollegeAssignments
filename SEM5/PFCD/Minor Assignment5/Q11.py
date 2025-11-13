def number_to_words(num):
    digits_map = {
        '0': 'Zero',
        '1': 'One',
        '2': 'Two',
        '3': 'Three',
        '4': 'Four',
        '5': 'Five',
        '6': 'Six',
        '7': 'Seven',
        '8': 'Eight',
        '9': 'Nine'
    }
    num_str = str(num)
    words = [digits_map[digit] for digit in num_str]
    return ' '.join(words)

result = number_to_words(int(input("Enter a number: ")))
print(result)

'''
Enter a number: 911
Nine One One

'''