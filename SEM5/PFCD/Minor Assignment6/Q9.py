def format_2d_array(arr):
    max_width = max(len(str(num)) for row in arr for num in row)

    formatted_rows = []
    for row in arr:
        formatted_row = " ".join(f"{num:>{max_width}}" for num in row)
        formatted_rows.append(formatted_row)
    return "\n".join(formatted_rows)

arr = [
    [1, 22, 333],
    [4444, 55, 6]
]
print(format_2d_array(arr))


'''
   1   22  333
4444   55    6

'''