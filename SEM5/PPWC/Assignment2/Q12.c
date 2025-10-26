#include <stdio.h>

int main() {
    double x, ratio, sum = 0.0, power = 1.0, term;
    int i, n;

    printf("Enter x: ");
    scanf("%lf", &x);

    ratio = (x - 1) / x;

    for (n = 1; n <= 9; n++) {
        power = 1.0;
        for (i = 1; i <= n; i++) {
            power = power * ratio;
        }
        if (n == 1)
            term = power; 
        else
            term = 0.5 * power;
        sum = sum + term;
    }

    printf("Sum of the first nine terms: %lf\n", sum);
    return 0;
}


/*
Enter x: 4
Sum of the first nine terms: 1.762373
*/