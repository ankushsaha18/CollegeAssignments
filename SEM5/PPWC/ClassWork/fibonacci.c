#include<stdio.h>
int fibonacci(int);
int main(){
    int n;
    printf("Enter which Fibonacci number to find: ");
    scanf("%d",&n);
    printf("%dth Fibonacci number is %d\n",n,fibonacci(n));
}
int  fibonacci(int n){
    if(n == 1) return 0;
    if(n == 2) return 1;
    return fibonacci(n-1) + fibonacci(n-2);
}