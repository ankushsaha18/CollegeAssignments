#include <stdio.h>
int main() {
    int a[6] = {120, 502, 118, 188, 106, 447};
    int *ptr = a;
    printf("Array content using pointer:\n");
    for (int i = 0; i < 6; i++) {
        printf("%d ", *(ptr + i));
    }
    return 0;
}

/*
Array content using pointer:
120 502 118 188 106 447
*/