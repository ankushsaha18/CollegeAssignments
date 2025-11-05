#include <stdio.h>

int main() {
    int n;
    printf("Enter n: ");
    scanf("%d", &n);
    int arr[n]; 
    printf("Enter elements of the array: ");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int distinct[n];
    int count = 0;

    for (int i = 0; i < n; i++) {
        int isDistinct = 1;
        for (int j = 0; j < count; j++) {
            if (arr[i] == distinct[j]) {
                isDistinct = 0;
                break;
            }
        }
        if (isDistinct) {
            distinct[count++] = arr[i];
        }
    }

    printf("Output array with distinct elements: ");
    for (int i = 0; i < count; i++) {
        printf("%d ", distinct[i]);
    }
    return 0;
}


/*
Enter n: 7
Enter elements of the array: 1 2 3 7 6 7 7
Output array with distinct elements: 1 2 3 7 6
*/