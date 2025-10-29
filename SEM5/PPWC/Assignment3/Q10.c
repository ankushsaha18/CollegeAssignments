#include <stdio.h>

void selectionSort(int arr[], int n) {
    int i, j, min, temp;
    for (i = 0; i < n - 1; i++) {
        min = i;
        for (j = i + 1; j < n; j++) {
            if (arr[j] < arr[min]) {
                min = j;
            }
        }
        temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}

int main() {
    int n, i;
    printf("Enter n: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter elements:");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    selectionSort(arr, n);
    printf("Sorted array: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    return 0;
}


/*
Enter n: 10
Enter elements:1 6 3 10 99 45 34 67 9 30
Sorted array: 1 3 6 9 10 30 34 45 67 99
*/