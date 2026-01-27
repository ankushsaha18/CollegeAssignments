rate=12

for i in {1..5}
do
    echo "Enter hours worked:"
    read hours

    if [ $hours -gt 40 ]
    then
        ov=$((hours - 40))
        pay=$((ov * rate))
        echo "Overtime pay is: $pay"
    else
        echo "No overtime pay."
    fi
done
