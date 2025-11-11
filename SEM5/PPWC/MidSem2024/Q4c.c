#include<stdio.h>

void displayReversed(int n){
    if(n == 0) return;
    printf("%d", n % 10);
    return displayReversed(n / 10);
}

int main(){
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    printf("Reversed number: ");
    displayReversed(n);
    printf("\n");
    return 0;
}