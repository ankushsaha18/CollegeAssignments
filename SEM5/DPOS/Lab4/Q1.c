#include <stdio.h>
#include <unistd.h>

int main() {
    pid_t pid = fork();

    if (pid < 0) {
        printf("Fork failed\n");
        return 1;
    }

    if (pid == 0) {   
        printf("Child Process: PID = %d\n", getpid());
        while (1) {
            printf("Child\n");
            sleep(1);
        }
    } 
    else {            
        printf("Parent Process: PID = %d\n", getpid());
        while (1) {
            printf("Parent\n");
            sleep(1);
        }
    }

    return 0;
}
