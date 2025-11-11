#include<stdio.h>
int main() {
    int n;
    printf("Enter size: ");
    scanf("%d", &n);
    int arr[n];
    printf("Enter elements: ");
    for(int i = 0; i < n; i++) {
        scanf("%d", arr+i);
    }
    int *max = arr;
    for(int i = 0; i < n; i++) {
        if(*(arr+i) > *max) {
            max = arr + i;
        }
    }
    printf("Maximum element is: %d\n", *max);
    return 0;
}