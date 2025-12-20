import re

def is_valid_url(s):
    pattern = re.compile(
        r'^(https?://)?'       
        r'([a-zA-Z0-9-]+\.)+'   
        r'[a-zA-Z]{2,}'        
        r'(/.*)?$'        
    )
    return bool(pattern.match(s))

print(is_valid_url("https://www.google.com"))  # True
print(is_valid_url("google"))                  # False
