#include<stdio.h>
#include<stdlib.h>
int main(){
    int *a = (int *)calloc(20,sizeof(int));
    for(int i = 0 ; i < 20 ; i++){
        if(i % 2 == 0)
            *(a+i) = 1;
    }
    printf("Array:");
    for(int i = 0 ; i < 20 ; i++)
        printf("%d ", *(a+i));
    free(a);
    return 0;
}