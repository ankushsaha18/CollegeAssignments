#include <stdio.h>

void mergeArrays(int a[], int m, int b[], int n, int result[]) {
    int i = 0, j = 0, k = 0;
    while (i < m && j < n) {
        if (a[i] < b[j]) {
            result[k++] = a[i++];
        } else {
            result[k++] = b[j++];
        }
    }
    while (i < m) {
        result[k++] = a[i++];
    }
    while (j < n) {
        result[k++] = b[j++];
    }
}

int main() {
    int m, n, i;
    printf("Enter m: ");
    scanf("%d", &m);
    int a[m];
    printf("Enter first array:");
    for (i = 0; i < m; i++) {
        scanf("%d", &a[i]);
    }

    printf("Enter n: ");
    scanf("%d", &n);
    int b[n];
    printf("Enter second array:");
    for (i = 0; i < n; i++) {
        scanf("%d", &b[i]);
    }

    int result[m + n];
    mergeArrays(a, m, b, n, result);

    printf("Merged sorted array: ");
    for (i = 0; i < m + n; i++) {
        printf("%d ", result[i]);
    }
    printf("\n");
    return 0;
}


/*
Enter m: 4
Enter first array:12 20 45 78
Enter n: 5
Enter second array:34 45 67 89 101 
Merged sorted array: 12 20 34 45 45 67 78 89 101 
*/