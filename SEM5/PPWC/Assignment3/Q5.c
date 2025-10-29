#include <stdio.h>

int binary_srch(int arr[], int size, int target) {
    int bottom = 0, top = size - 1, middle;
    while (bottom <= top) {
        middle = (bottom + top) / 2;
        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] > target) {
            top = middle - 1;
        } else {
            bottom = middle + 1;
        }
    }
    return -1;
}

int main() {
    int n, i, target, result;
    printf("Enter n: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter %d sorted integers:", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    printf("Enter the target value to search: ");
    scanf("%d", &target);

    result = binary_srch(arr, n, target);

    if (result != -1)
        printf("%d found at index %d\n", target, result);
    else
        printf("%d not found in the array\n", target);

    return 0;
}


/*
Enter n: 10
Enter 10 sorted integers:1 2 4 6 8 9 10 45 57 90
Enter the target value to search: 10
10 found at index 6
*/