#include<stdio.h>
#include<stdlib.h>
int* add(int *ptr1, int *ptr2, int r, int c){
    int *sum = (int *)malloc(r*c*sizeof(int));
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            *(sum + i*c + j) = *(ptr1 + i*c + j) + *(ptr2 + i*c + j);
        }
    }
    return sum;
}
int main(){
    int r,c;
    printf("Enter rows and columns: ");
    scanf("%d%d",&r,&c);
    int *ptr = (int *)malloc(r*c*sizeof(int));
    int *ptr2 = (int *)malloc(r*c*sizeof(int));
    for(int i=0 ; i < r*c ; i++){
        scanf("%d",ptr+i);
    }
    for(int i=0 ; i < r*c ; i++){
        scanf("%d",ptr2+i);
    }
    printf("The matrix 1 is:\n");
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            printf("%d ",*(ptr + i*c + j));
        }
        printf("\n");
    }
    printf("The matrix 2 is:\n");
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            printf("%d ",*(ptr2 + i*c + j));
        }
        printf("\n");
    }
    int *sum = add(ptr,ptr2,r,c);
    printf("The sum of the two matrices is:\n");
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            printf("%d ",*(sum + i*c + j));
        }
        printf("\n");
    }
    free(ptr);
    free(ptr2);
    free(sum);
    return 0;
}