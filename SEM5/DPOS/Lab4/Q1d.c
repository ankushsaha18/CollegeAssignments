// (d-e)

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid == 0) {  
        printf("Child Process: PID = %d\n", getpid());
        while (1) {
            printf("Child\n");
            sleep(1);
        }
    } 
    else {           
        printf("Parent Process: PID = %d\n", getpid());
        wait(NULL);
        printf("Parent: Child terminated. Parent exiting...\n");
    }

    return 0;
}
