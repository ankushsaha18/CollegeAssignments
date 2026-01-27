if [ $# -lt 1 ]; then
    echo "Usage: $0 <num1>"
    exit 1
fi

num=$1
is_prime=1

if [ $num -lt 2 ]; then
    is_prime=0
else
    for (( i=2; i*i<=num; i++ ))
    do
        if [ $((num % i)) -eq 0 ]; then
            is_prime=0
            break
        fi
    done
fi

if [ $is_prime -eq 1 ]; then
    echo "$num is a prime number."
else
    echo "$num is not a prime number."
fi