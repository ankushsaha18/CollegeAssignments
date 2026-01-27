import re

print('Match' if re.fullmatch(r'[^a-z]', 'a') else 'No match' )

# pd.set_option('display.precision', 2)