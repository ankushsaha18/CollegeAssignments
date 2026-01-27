echo "Enter basic salary:"
read basic

da=$(echo "0.40 * $basic" | bc)
hra=$(echo "0.30 * $basic" | bc)
gross=$(echo "$basic + $da + $hra" | bc)

echo "Dearness Allowance (40%): $da"
echo "House Rent Allowance (30%): $hra"
echo "Gross Salary: $gross"