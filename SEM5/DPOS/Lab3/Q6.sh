if [ $# -eq 0 ]; then
    year=$(date +%Y)
else
    year=$1
fi

if [ $((year % 400)) -eq 0 ] || { [ $((year % 4)) -eq 0 ] && [ $((year % 100)) -ne 0 ]; }
then
    echo "$year is a Leap Year"
else
    echo "$year is Not a Leap Year"
fi
