if [ $# -ne 1 ]; then
    echo "Usage: $0 filename"
    exit 1
fi

file=$1

if [ ! -f "$file" ]; then
    echo "File not found"
    exit 1
fi

echo "filename linecount wordcount charcount"
echo "$file $(wc -l < "$file") $(wc -w < "$file") $(wc -c < "$file")"
