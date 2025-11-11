#include<stdio.h>
int gcd(int a,int b){
    if(b == 0) return a;
    return gcd(b, a % b);
}
int lcm(int a,int b){
    return (a * b) / gcd(a, b);
}
int main(){
    int num1 = 10, num2 = 5;
    printf("LCM of %d and %d is %d\n", num1, num2, lcm(num1, num2));
    return 0;
}