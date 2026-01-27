echo "Enter first number:"
read a

echo "Enter second number:"
read b

echo "Addition: $(echo "$a + $b" | bc)"
echo "Subtraction: $(echo "$a - $b" | bc)"
echo "Multiplication: $(echo "$a * $b" | bc)"

if [ "$(echo "$b == 0" | bc)" -eq 0 ]; then
    echo "Division: $(echo "scale=2; $a / $b" | bc)"
else
    echo "Division not possible (division by zero)"
fi