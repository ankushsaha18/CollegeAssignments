#include <stdio.h>
int main() {
    int a = 52, b = 18;
    int *ptr1 = &a;
    int *ptr2 = &b;
    if (*ptr1 > *ptr2)
        printf("Greater value = %d\n", *ptr1);
    else
        printf("Greater value = %d\n", *ptr2);

    return 0;
}

// Greater value = 52