#include<stdio.h>
#include<unistd.h>

int main(){
    pid_t pid = fork();
    if(pid == 0){
        printf("Child Process PID: %d PPID: %d\n", getpid(), getppid());
        for(int i=0;i < 4 ; i++){
            if((pid = fork()) == 0){
                printf("Grandchild Process PID: %d PPID: %d\n", getpid(), getppid());
                break;
            }
        }
    }else{
        printf("Parent Process PID: %d\n", getpid());
    }
}