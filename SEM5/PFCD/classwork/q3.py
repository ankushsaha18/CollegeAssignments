import re

def passcheck(password):
    pattern = r'^[a-zA-Z0-9@#$%^&+=]{8,}$'
    return 'Strong Password' if re.fullmatch(pattern, password) else 'Weak Password'