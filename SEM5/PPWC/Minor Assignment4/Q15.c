#include <stdio.h>
int main(void) {
    int a, b, c, d, maxvar;
    int *arr[4] = { &a, &b, &c, &d };
    *arr[0] = 55;
    *arr[1] = 105;
    *arr[2] = 89; 
    *arr[3] = 68;
    maxvar = *arr[0];
    for (int i = 1; i < 4; ++i) {
        if (*arr[i] > maxvar) {
            maxvar = *arr[i];
        }
    }
    printf("a=%d, b=%d, c=%d, d=%d\n", a, b, c, d);
    printf("Maximum = %d\n", maxvar);
    return 0;
}


/*
a=55, b=105, c=89, d=68
Maximum = 105
*/