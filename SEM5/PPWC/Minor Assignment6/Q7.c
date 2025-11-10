#include <stdio.h>
#include <unistd.h>
int main(){
    fork();
    fork() || fork();
    fork();
    printf("Really!!!\n");
    return 0;
}

/*
Really!!!
Really!!!
Really!!!                                                                                                                                                  
Really!!!
Really!!!
Really!!!
Really!!!
Really!!!
Really!!!
Really!!!
Really!!!
Really!!!
*/