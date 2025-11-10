#include <stdio.h>

int main() {
    int a[6] = {120, 502, 118, 188, 106, 447};
    int *ptr1 = &a[0];
    int *ptr2 = &a[1];
    int *ptr3 = &a[2];
    int *ptr4 = &a[3];
    int *ptr5 = &a[4];
    int *ptr6 = &a[5];
    printf("Array contents using individual pointers:\n");
    printf("ptr1 -> %d\n", *ptr1);
    printf("ptr2 -> %d\n", *ptr2);
    printf("ptr3 -> %d\n", *ptr3);
    printf("ptr4 -> %d\n", *ptr4);
    printf("ptr5 -> %d\n", *ptr5);
    printf("ptr6 -> %d\n", *ptr6);
    return 0;
}

/*
Array contents using individual pointers:
ptr1 -> 120
ptr2 -> 502
ptr3 -> 118
ptr4 -> 188
ptr5 -> 106
ptr6 -> 447
*/