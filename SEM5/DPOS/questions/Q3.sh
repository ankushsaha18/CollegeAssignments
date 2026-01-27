echo "Enter internal marks:"
read internal

echo "Enter attendance percentage:"
read attendance

echo "Enter external marks:"
read external   

cond=0

if [ $internal -lt 16 ]; then
    cond=1
fi
if [ $attendance -lt 40 ]; then
    cond=1
fi
if [ $external -lt 24 ]; then
    cond=1
fi 

if [ $cond -eq 0 ]; then
    echo "Allowed for next semester."
else
    echo "Student has failed."

    if [ $internal -lt 16 ]; then
        echo "Internal marks are insufficient."
    fi
    if [ $attendance -lt 40 ]; then
        echo "Attendance percentage is insufficient"
    fi
    if [ $external -lt 24 ]; then
        echo "External marks are insufficient."
    fi
fi