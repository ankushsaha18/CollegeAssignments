#include <stdio.h>
#include <unistd.h>
int main(){
    if (fork()){
        if (!fork()){
            fork();
            printf("S ");
        }
        else{
            printf("T ");
        }
    }
    else{
        printf("D ");
    }
    printf("A ");
    return 0;
}

// D A T A S A S A