#include <stdio.h>
int main() {
    int a = 12, b = 25, c = 18;
    int *ptr;
    ptr = &a;
    *ptr = *ptr + 10;
    ptr = &b;
    *ptr = *ptr + 10;
    ptr = &c;
    *ptr = *ptr + 10;
    printf("Updated a = %d\n", a);
    printf("Updated b = %d\n", b);
    printf("Updated c = %d\n", c);
    return 0;
}

/*
Updated a = 22
Updated b = 35
Updated c = 28
*/