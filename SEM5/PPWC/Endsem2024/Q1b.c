#include<stdio.h>
void IsPalindrome(int num){
    int rev = 0;
    int temp = num;
    while(num > 0){
        rev = rev * 10 + num % 10;
        num = num / 10;
    }
    if(rev == temp){
        printf("%d is a palindrome number.\n", temp);
    } else {
        printf("%d is not a palindrome number.\n", temp);
    }
}
int main(){
    IsPalindrome(121);
    IsPalindrome(123);
    return 0;
}