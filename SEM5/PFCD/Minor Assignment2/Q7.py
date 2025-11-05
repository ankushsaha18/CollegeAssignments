n = int(input("Enter a number: "))

def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

prime_sum = 0
for i in range(2, n):
    if is_prime(i):
        prime_sum += i

print(f"Sum of all prime numbers less than {n} is {prime_sum}.")



'''
Enter a number: 35
Sum of all prime numbers less than 35 is 160.

'''