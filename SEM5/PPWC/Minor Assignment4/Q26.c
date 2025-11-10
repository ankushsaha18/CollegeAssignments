#include <stdio.h>

int main() {
    int r, c;
    printf("Enter number of rows and columns: ");
    scanf("%d %d", &r, &c);
    int a[r][c], t[c][r];
    printf("Enter the elements of the matrix:");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            scanf("%d", (*(a + i) + j));  
        }
    }
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            *(*(t + i) + j) = *(*(a + j) + i);   
        }
    }

    printf("\nTransposed Matrix:\n");
    for (int i = 0; i < c; i++) {
        for (int j = 0; j < r; j++) {
            printf("%d ", *(*(t + i) + j));
        }
        printf("\n");
    }

    return 0;
}


/*
Enter number of rows and columns: 3 3
Enter the elements of the matrix:1 2 3 4 5 6 7 8 9

Transposed Matrix:
1 4 7 
2 5 8 
3 6 9 
*/