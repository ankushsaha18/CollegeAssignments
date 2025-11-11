#include <stdio.h>
#include <unistd.h>

int main(void){
    pid_t r;
    r = fork() || (fork() && fork());

    fork();

    printf("%d\n", r); 
    return 0;
}
