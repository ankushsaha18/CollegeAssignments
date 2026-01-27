echo "Enter internal marks:"
read marks

echo "Enter attendance percentage:"
read attendance

if [ "$marks" -ge 20 ] && [ "$attendance" -ge 75 ]; then
    echo "Allowed for Semester"
else
    echo "Not Allowed"
fi
