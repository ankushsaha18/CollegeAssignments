#include <stdio.h>
int main() {
    int a[4], b[4], c[4], d[4], sumarr[4];
    int *arr[4] = { a, b, c, d };
    printf("Enter 4 elements for array a:");
    for (int i = 0; i < 4; i++)
        scanf("%d", (arr[0] + i));
    printf("Enter 4 elements for array b:");
    for (int i = 0; i < 4; i++)
        scanf("%d", (arr[1] + i));
    printf("Enter 4 elements for array c:");
    for (int i = 0; i < 4; i++)
        scanf("%d", (arr[2] + i));
    printf("Enter 4 elements for array d:");
    for (int i = 0; i < 4; i++)
        scanf("%d", (arr[3] + i));

    for (int i = 0; i < 4; i++) {
        sumarr[i] = *(arr[0] + i) +
                    *(arr[1] + i) +
                    *(arr[2] + i) +
                    *(arr[3] + i);
    }

    printf("\nElementwise sum:\n");
    for (int i = 0; i < 4; i++)
        printf("%d ", sumarr[i]);

    return 0;
}

/*
Enter 4 elements for array a:1 2 3 4
Enter 4 elements for array b:4 5 6 7
Enter 4 elements for array c:5 6 7 8
Enter 4 elements for array d:6 7 8 9 

Elementwise sum:
16 20 24 28 
*/
