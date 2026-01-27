echo "Total number of arguments: $#"

if [ $# -ge 1 ]; then
    echo "First argument: $1"
fi

if [ $# -ge 2 ]; then
    echo "Second argument: $2"
fi

echo "All arguments:"
for arg in "$@"
do
    echo "$arg"
done
