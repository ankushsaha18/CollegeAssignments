echo "Enter day:"
read day

case "$day" in
    Monday|monday)
        echo "DOS class from 2 PM to 4 PM in Room C124"
        ;;
    Tuesday|tuesday)
        echo "DOS class from 8 AM to 9 AM in Room C223"
        ;;
    Wednesday|wednesday)
        echo "DOS class from 12 PM to 1 PM in Room C124"
        ;;
    Thursday|thursday)
        echo "No class on $day"
        ;;
    Friday|friday)
        echo "No class on $day"
        ;;
    Saturday|saturday)
        echo "DOS class from 5 PM to 6 PM in Room C223"
        ;;
    Sunday|sunday)
        echo "Holiday"
        ;;
    *)
        echo "Invalid day"
        ;;
esac
