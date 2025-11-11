#include<stdio.h>
typedef struct{
    float length;
    float breadth;
}rectangle;
int compare(rectangle *r1, rectangle *r2){
    if(r1->length != r2->length){
        return 0;
    }
    if(r1->breadth != r2->breadth){
        return 0;
    }
    return 1;
}
int main(){
    rectangle r1, r2;
    printf("Enter length and breadth of rectangle 1: ");
    scanf("%f %f", &r1.length, &r1.breadth);
    printf("Enter length and breadth of rectangle 2: ");
    scanf("%f %f", &r2.length, &r2.breadth);
    if(compare(&r1, &r2)){
        printf("Rectangles are equal.\n");
    }else{
        printf("Rectangles are not equal.\n");
    }
    return 0;
}