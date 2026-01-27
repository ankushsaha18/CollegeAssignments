#include<stdio.h>
#include<unistd.h>

int main(){
    int pid = fork();
    execl("/usr/bin/echo", "echo", "SOA", NULL);
    printf("ITER, BBSR\n");
    return 0;
}