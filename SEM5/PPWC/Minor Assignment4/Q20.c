void sum_n_avg(double n1, double n2, double n3, double *sump, double *avgp);

#include <stdio.h>
int main() {
    double num1, num2, num3, sum, avg;

    printf("Enter three numbers: ");
    scanf("%lf %lf %lf", &num1, &num2, &num3);

    sum_n_avg(num1, num2, num3, &sum, &avg);

    printf("Sum = %.2f\n", sum);
    printf("Average = %.2f\n", avg);
    return 0;
}
void sum_n_avg(double n1, double n2, double n3, double *sump, double *avgp) {
    *sump = n1 + n2 + n3;
    *avgp = *sump / 3.0;
}

/*
Enter three numbers: 1 5.5 89.567
Sum = 96.07
Average = 32.02
*/