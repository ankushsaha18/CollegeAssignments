#include <stdio.h>

void sumarr(int a[], int b[], int r[], int size) {
    int i;
    for (i = 0; i < size; i++) {
        r[i] = a[i] + b[i];
    }
}

int main() {
    int size, i;
    
    printf("Enter the size: ");
    scanf("%d", &size);

    int a[size], b[size], r[size];

    printf("Enter elements for array a:");
    for (i = 0; i < size; i++) {
        scanf("%d", &a[i]);
    }
    printf("Enter elements for array b:");
    for (i = 0; i < size; i++) {
        scanf("%d", &b[i]);
    }

    sumarr(a, b, r, size);

    printf("Resultant array: ");
    for (i = 0; i < size; i++) {
        printf("%d ", r[i]);
    }
    printf("\n");

    return 0;
}


/*
Enter the size: 5
Enter elements for array a:1 2 3 8 4
Enter elements for array b:0 -3 5 1 -7
Resultant array: 1 -1 8 9 -3 
*/