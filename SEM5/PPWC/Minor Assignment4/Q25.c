#include <stdio.h>

int main() {
    int n;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    int *p = arr;  
    printf("Enter %d integers:", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", (p + i));   
    }
    int max = *p;               
    for (int i = 1; i < n; i++) {
        if (*(p + i) > max) {
            max = *(p + i);     
        }
    }
    printf("Largest value = %d\n", max);
    return 0;
}


/*
Enter number of elements: 5
Enter 5 integers:1 5 98 20 45
Largest value = 98
*/