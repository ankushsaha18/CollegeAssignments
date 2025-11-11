#include<stdio.h>
int rmax(int *p, int n) {
    if (n == 1)
        return p[0];

    int max_rest = rmax(p + 1, n - 1);

    return (p[0] > max_rest) ? p[0] : max_rest;
}
int main() {
    int arr[] = {12, 3, 45, 7, 23, 89, 4};
    int size = sizeof(arr) / sizeof(arr[0]);
    int max_value = rmax(arr, size);
    printf("Maximum value in the array is: %d\n", max_value);
    return 0;
}