#include<stdio.h>
int main(){
    char ch='A';
    printf("%d",sizeof(ch));
    printf("%d\n",sizeof('A'));

    char ch1=97;
    printf("%d",sizeof(ch1+4));
    
    return(0);
}

/*
    14

    4
*/