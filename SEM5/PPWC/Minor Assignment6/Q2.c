#include <stdio.h>
#include <unistd.h>

int main(void){
    printf("hello\n");
    fork();
    printf("hello\n");
    fork();
    printf("hello\n");
    fork();
    printf("hello\n");
    return 0;
}

/*
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
hello
*/