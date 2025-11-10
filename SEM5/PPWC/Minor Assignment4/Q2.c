#include <stdio.h>

int main() {
    int a = 10;
    int b = 20;
    printf("a = %d\t address = %p\n", a,&a);
    printf("b = %d\t address = %p\n", b,&b);
    int temp = a;
    a = b;
    b = temp;
    printf("\nAfter swapping:\n");
    printf("a = %d\t address = %p\n", a,&a);
    printf("b = %d\t address = %p\n", b,&b);
    return 0;
}

/*
a = 10   address = 0x16ef96878
b = 20   address = 0x16ef96874

After swapping:
a = 20   address = 0x16ef96878
b = 10   address = 0x16ef96874
*/