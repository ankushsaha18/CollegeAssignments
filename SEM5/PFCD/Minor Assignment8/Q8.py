import json

def safe_load_json(filename):
    try:
        with open(filename, 'r') as f:
            data = json.load(f)
        print("JSON data successfully loaded.")
        print("Deserialized Data:", data)
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
        print("No valid data could be loaded")
    except json.JSONDecodeError:
        print("Error: Invalid JSON format.")
        print("No valid data could be loaded")

safe_load_json("data.json")
