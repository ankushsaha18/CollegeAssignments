echo "Enter marks of 3 subjects:"
read sub1 sub2 sub3

avg=$(( (sub1 + sub2 + sub3) / 3 ))

if [ $avg -ge 75 ]; then
    echo "Distinction"
elif [ $avg -ge 60 ]; then
    echo "First Class"
elif [ $avg -ge 50 ]; then
    echo "Second Class"
elif [ $avg -ge 40 ]; then
    echo "Pass Class"
else
    echo "Fail"
fi


