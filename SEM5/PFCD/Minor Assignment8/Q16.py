import csv

def csv_to_dict_list(filename):
    try:
        with open(filename, newline='', encoding='utf-8') as f:
            reader = csv.DictReader(f)
            data = list(reader)

        print(f"Successfully read {len(data)} rows from '{filename}'.")
        print("First 5 rows of the CSV data as dictionaries:")
        for row in data[:5]:
            print(row)

    except FileNotFoundError:
        print(f"Error: File '{filename}' not found.")

csv_to_dict_list("sample.csv")
