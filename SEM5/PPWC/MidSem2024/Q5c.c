#include<stdio.h>
int main() {
    int a[3][4] = {{1,2,3,4},{4,3,2,1}};
    printf("%u, %u\n",a, *a);
    printf("%u, %u\n",a+1, &a+1);
    return 0;
}   