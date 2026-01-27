even=0
odd=0

echo "Enter 10 numbers:"

for i in {1..10}
do
    read num
    if [ $((num % 2)) -eq 0 ]; then
        even=$((even + 1))
    else
        odd=$((odd + 1))
    fi
done

echo "Even numbers count: $even"
echo "Odd numbers count: $odd"