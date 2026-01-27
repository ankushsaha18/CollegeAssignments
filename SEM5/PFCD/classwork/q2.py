import re

def validURL(url):
    pt = r"https?://(www\.[a-zA-Z0-9]+\.[a-z]{2,})(/[a-zA-Z0-9#]+/?)*"
    return 'Valid URL' if re.fullmatch(pt, url) else 'Invalid URL'

print(validURL("https://www.example.com/path/to/resource"))