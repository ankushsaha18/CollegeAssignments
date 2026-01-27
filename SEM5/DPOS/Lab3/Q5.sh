echo "Enter Cost Price:"
read cp

echo "Enter Selling Price:"
read sp

if [ "$sp" -gt "$cp" ]; then
    profit=$((sp - cp))
    echo "Profit made: $profit"
elif [ "$sp" -lt "$cp" ]; then
    loss=$((cp - sp))
    echo "Loss incurred: $loss"
else
    echo "No profit, no loss"
fi
