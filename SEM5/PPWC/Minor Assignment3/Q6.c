#include <stdio.h>

int main() {
    int m,n;
    printf("Enter size of arrays:");
    scanf("%d %d", &m, &n);
    int p[m], q[n];
    printf("Enter elements of first array:");
    for (int i = 0; i < m; i++) {
        scanf("%d", &p[i]);
    }
    printf("Enter elements of second array:");
    for (int i = 0; i < n; i++) {
        scanf("%d", &q[i]);
    }
    int diff[m];
    int k = 0;
    int found;

    for (int i = 0; i < m; i++) {
        found = 0;
        for (int j = 0; j < n; j++) {
            if (p[i] == q[j]) {
                found = 1;
                break;
            }
        }
        if (!found) {
            diff[k++] = p[i];
        }
    }

    printf("Difference: ");
    for (int i = 0; i < k; i++) {
        printf("%d ", diff[i]);
    }
    return 0;
}

/*
Enter size of arrays:3 5
Enter elements of first array:2 3 4    
Enter elements of second array:5 6 7 1 3 0
Difference: 2 4
*/