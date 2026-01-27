file="Q3"

echo "Filename: $file"
echo "Line count: $(wc -l < "$file")"
echo "Word count: $(wc -w < "$file")"
echo "Charcount: $(wc -c < "$file")"