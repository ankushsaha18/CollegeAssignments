digit_words = {
    '0': 'ZERO',
    '1': 'ONE',
    '2': 'TWO',
    '3': 'THREE',
    '4': 'FOUR',
    '5': 'FIVE',
    '6': 'SIX',
    '7': 'SEVEN',
    '8': 'EIGHT',
    '9': 'NINE'
}

num = int(input("Enter an integer: "))
for digit in str(num):
    print(digit_words[digit], end=' ')

'''
Enter an integer: 3425
THREE FOUR TWO FIVE 

'''
