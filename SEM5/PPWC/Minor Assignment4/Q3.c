#include <stdio.h>

int main() {
    float x = 6.7;
    float y = 1.2;
    float z = 2.3;
    float *p;
    p = &x;
    printf("Value of x = %.2f\n", *p);
    p = &y;
    printf("Value of y = %.2f\n", *p);
    p = &z;
    printf("Value of z = %.2f\n", *p);
    return 0;
}

/*
Value of x = 6.70
Value of y = 1.20
Value of z = 2.30
*/