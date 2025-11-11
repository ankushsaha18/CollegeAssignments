#include<stdio.h>
int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if(n < 0) n*= -1;
    int digits = 0;
    while(n > 0){
        digits++;
        n /= 10;    
    }
    printf("Number of digits: %d\n", digits);
    return 0;
}