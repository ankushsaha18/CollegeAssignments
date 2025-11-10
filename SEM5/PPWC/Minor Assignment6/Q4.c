#include <stdio.h>
#include <unistd.h>
int main(){
    fork() && fork();
    printf("Able to\n");
    return 0;
}

/*
Able to
Able to
Able to
*/