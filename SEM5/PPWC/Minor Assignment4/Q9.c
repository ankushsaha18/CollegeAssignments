#include <stdio.h>

int main() {
    int a[5] = {10, 13, 20, 33, 44};
    float b[5] = {10.2, 13.3, 20.0, 33.3, 45.3};

    printf("Integer Array:\n");
    for (int i = 0; i < 5; i++) {
        printf("Value = %d\t Address = %p\n", *(a + i),(a + i));
    }

    printf("\nFloat Array:\n");
    for (int i = 0; i < 5; i++) {
        printf("Value = %.1f\t Address = %p\n", *(b + i),(b + i));
    }

    return 0;
}

/*
Integer Array:
Value = 10       Address = 0x16f5ea870
Value = 13       Address = 0x16f5ea874
Value = 20       Address = 0x16f5ea878
Value = 33       Address = 0x16f5ea87c
Value = 44       Address = 0x16f5ea880

Float Array:
Value = 10.2     Address = 0x16f5ea850
Value = 13.3     Address = 0x16f5ea854
Value = 20.0     Address = 0x16f5ea858
Value = 33.3     Address = 0x16f5ea85c
Value = 45.3     Address = 0x16f5ea860
*/