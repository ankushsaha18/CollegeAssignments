#include<stdio.h>
int main(){
    int a = 52;
    int b = 18;
    int *ptr1 = &a;
    int *ptr2 = &b;
    printf("a = %d, b = %d\n", *ptr1, *ptr2);
}