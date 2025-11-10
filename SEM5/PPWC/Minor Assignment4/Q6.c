#include <stdio.h>

int main() {
    int a = 12, b = 52, c = 8;
    int *ptr1 = &a; 
    int *ptr2 = &b;
    int *ptr3 = &c; 
    *ptr1 = *ptr1 + 10; 
    *ptr2 = *ptr2 + 10; 
    *ptr3 = *ptr3 + 10; 
    printf("Updated a = %d\n", a);
    printf("Updated b = %d\n", b);
    printf("Updated c = %d\n", c);
    return 0;
}

/*
Updated a = 22
Updated b = 62
Updated c = 18
*/