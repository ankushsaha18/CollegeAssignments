#include <stdio.h>

int main() {
    int x = 89;
    int *p1 = &x;
    int *p2 = &x;
    int *p3 = &x;
    printf("Value of x using p1 = %d\n", *p1);
    *p3 = 100;
    printf("Updated value of x using p3 = %d\n", *p3);
    printf("Value of x using p1 = %d\n", *p1);
    return 0;
}

/*
Value of x using p1 = 89
Updated value of x using p3 = 100
Value of x using p1 = 100
*/