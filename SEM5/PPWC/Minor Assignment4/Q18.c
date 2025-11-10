// Dynamic Memory Allocation using malloc()

#include <stdio.h>
#include <stdlib.h>
int main(){
    // fig1
    int *arr[4]; // array of 4 int pointers
    for (int i = 0; i < 4; i++){
        arr[i] = (int *)malloc(sizeof(int));
    }
    free(arr[0]);
    free(arr[1]);
    free(arr[2]);
    free(arr[3]);

    // fig2
    int *arr[4]; // array of 4 int pointers
    for (int i = 0; i < 4; i++){
        arr[i] = (int *)malloc(4 * sizeof(int)); // allocate array of int (size 4) for each
    }
    free(arr[0]);
    free(arr[1]);
    free(arr[2]);
    free(arr[3]);

    // fig3
    char *argv[5]; // array of 5 char pointers (last one for NULL)
    argv[0] = (char *)malloc(5 * sizeof(char)); // "mine"
    argv[1] = (char *)malloc(3 * sizeof(char)); // "cs"
    argv[2] = (char *)malloc(3 * sizeof(char)); // "sc"
    argv[3] = (char *)malloc(4 * sizeof(char)); // "soa"
    argv[4] = NULL;

    return 0;
}