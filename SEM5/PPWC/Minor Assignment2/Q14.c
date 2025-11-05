#include <stdio.h>

int main() {
    int n, i;

    printf("Enter the number > ");
    scanf("%d", &n);

    for (i = 1; i <= 10; i++) {
        printf("%d ", n * i);
    }
    printf("\n");

    for (i = 1; i <= 10; i++) {
        printf("%d ", i);
    }
    printf("\n");

    for (i = 1; i <= 10; i++) {
        printf("%d ", n);
    }
    printf("\n");

    return 0;
}


/*
Enter the number > 6
6 12 18 24 30 36 42 48 54 60 
1 2 3 4 5 6 7 8 9 10 
6 6 6 6 6 6 6 6 6 6 
*/