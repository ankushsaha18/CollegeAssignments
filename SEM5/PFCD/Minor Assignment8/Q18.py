import csv

def merge_csv(file1, file2):
    combined = []

    for file in (file1, file2):
        with open(file, newline='', encoding='utf-8') as f:
            reader = csv.DictReader(f)
            combined.extend(reader)

    # print combined dataset
    print("Combined Titanic Dataset:")
    for row in combined:
        print(row)

merge_csv("titanic1.csv", "titanic2.csv")
