import re

def extract_unique_emails(input_file, output_file):
    with open(input_file, 'r') as f:
        text = f.read()

    emails = sorted(set(re.findall(r'[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}', text)))

    with open(output_file, 'w') as f:
        for email in emails:
            f.write(email + '\n')

extract_unique_emails("sample.txt", "Output.txt")
