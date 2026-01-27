if [ $# -ne 3 ]; then
    echo "Usage: $0 n m filename"
    exit 1
fi

n=$1
m=$2
file=$3

if [ ! -f "$file" ]; then
    echo "File not found"
    exit 1
fi

echo "First $n lines of $file:"
head -n "$n" "$file"

echo
echo "Last $m lines of $file:"
tail -n "$m" "$file"
