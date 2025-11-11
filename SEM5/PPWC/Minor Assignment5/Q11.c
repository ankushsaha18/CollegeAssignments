#include <stdio.h>
#include <stdlib.h>

int main() {
    int r, c, i, j;
    printf("Enter rows and cols: ");
    scanf("%d %d", &r, &c);

    int **A = (int **)malloc(r * sizeof(int *));
    for (i = 0; i < r; i++)
        A[i] = (int *)malloc(c * sizeof(int));

    printf("Enter elements: ");
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
            scanf("%d", (*(A + i) + j));

    printf("\nMatrix:\n");
    for (i = 0; i < r; i++) {
        for (j = 0; j < c; j++)
            printf("%d ", *(*(A + i) + j));
        printf("\n");
    }

    int min = **A, max = **A;
    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++) {
            if (A[i][j] < min) min = A[i][j];
            if (A[i][j] > max) max = A[i][j];
        }

    int **T = malloc(c * sizeof(int *));
    for (i = 0; i < c; i++)
        T[i] = malloc(r * sizeof(int));

    for (i = 0; i < r; i++)
        for (j = 0; j < c; j++)
            T[j][i] = A[i][j];

    printf("\nTranspose:\n");
    for (i = 0; i < c; i++) {
        for (j = 0; j < r; j++)
            printf("%d ", T[i][j]);
        printf("\n");
    }

    printf("\nMin = %d\nMax = %d\n", min, max);

    return 0;
}


/*
Enter rows and cols: 3 3
Enter elements: 1 2 3 4 5 6 7 8 9

Matrix:
1 2 3 
4 5 6 
7 8 9 

Transpose:
1 4 7 
2 5 8 
3 6 9 

Min = 1
Max = 9
*/