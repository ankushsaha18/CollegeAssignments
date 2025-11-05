def number_to_text(num):
    digit_words = ["zero", "one", "two", "three", "four", 
                   "five", "six", "seven", "eight", "nine"]
    text = ""
    for digit in str(num):
        text += digit_words[int(digit)] + " "
    
    return text.strip()

num = int(input("Enter a positive number: "))
print("Number in words:", number_to_text(num))


'''
Enter a positive number: 123
Number in words: one two three

'''