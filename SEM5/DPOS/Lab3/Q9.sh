echo "Enter a character:"
read ch

if [ ${#ch} -ne 1 ]; then
    echo "You have entered more than one character."
elif [[ $ch =~ [a-z] ]]; then
    echo "You entered a lower case alphabet."
elif [[ $ch =~ [A-Z] ]]; then
    echo "You entered an upper case alphabet."
elif [[ $ch =~ [0-9] ]]; then
    echo "You have entered a digit."
else
    echo "You have entered a special symbol."
fi