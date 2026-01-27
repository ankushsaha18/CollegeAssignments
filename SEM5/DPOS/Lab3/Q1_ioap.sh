echo "Enter first number:"
read a

echo "Enter second number:"
read b

echo "Addition: $((a + b))"
echo "Subtraction: $((a - b))"
echo "Multiplication: $((a * b))"

if [ $b -ne 0 ]; then
    echo "Division: $((a / b))"
else
    echo "Division not possible (division by zero)"
fi