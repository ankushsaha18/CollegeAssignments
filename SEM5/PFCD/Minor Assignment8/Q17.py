def write_user_input_to_file(filename):
    try:
        text = input("Enter text to write to file: ").strip()
        if not text:
            raise ValueError("Empty input is not allowed")

        with open(filename, "w", encoding="utf-8") as f:
            f.write(text)

        print("Data written successfully.")

    except ValueError as ve:
        print("Input Error:", ve)
    except IOError as ioe:
        print("File Error:", ioe)
    except Exception as e:
        print("Unexpected Error:", e)

write_user_input_to_file("output.txt")
