#include <stdio.h>
#include <math.h>
int MAX_SIZE = 10;
int stack[10];
int top = -1;
void push(int n){
    if(top == MAX_SIZE - 1){
        printf("Stack Overflow\n");
        return;
    }
    stack[++top] = n;
}
int pop(){ 
    if(top == -1){
        printf("Stack Underflow\n");
        return -1;
    }
    return stack[top--];
}
int findarmstrong(int n) {
    int temp = n;
    while (temp != 0){
        push(temp % 10);
        temp /= 10;
    }
    int sum = 0;
    int digits = top + 1;
    while (top != -1){
        int digit = pop();
        sum += (int)pow(digit, digits);
    }
    return sum == n;
}
int main(){ 
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);
    if(findarmstrong(n)){
        printf("%d is an armstrong number\n", n);
    }
    else{
        printf("%d is not an armstrong number\n", n);
    }
    
}
