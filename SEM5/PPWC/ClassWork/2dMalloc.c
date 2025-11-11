#include<stdio.h>
#include<stdlib.h>
int *transpose(int *ptr, int r, int c){
    int *trans = (int *)malloc(c*r*sizeof(int));
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            *(trans + j*r +i) = *(ptr + i*c + j);
        }
    }
    return trans;
}
int main(){
    int r,c;
    printf("Enter rows and columns: ");
    scanf("%d%d",&r,&c);
    int *ptr = (int *)malloc(r*c*sizeof(int));
    for(int i=0 ; i < r*c ; i++){
        scanf("%d",ptr+i);
    }
    printf("The matrix is:\n");
    for(int i=0 ; i < r ; i++){
        for(int j=0 ; j < c ; j++){
            printf("%d",*(ptr + i*c + j));
        }
        printf("\n");
    }
    int *trans = transpose(ptr,r,c);    
    printf("The transposed matrix is:\n");
    for(int i=0 ; i < c ; i++){
        for(int j=0 ; j < r ; j++){
            printf("%d",*(trans + i*r + j));
        }
        printf("\n");
    }
    free(ptr);
    free(trans);
    return 0;
}