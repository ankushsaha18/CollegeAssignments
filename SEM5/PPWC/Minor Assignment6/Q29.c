/* PracticeExecl.c */
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main() {
    pid_t pid;
    int status;

    pid = fork();

    if (pid == 0) {
        // CHILD PROCESS
        execl("./MulThree", "MulThree", "2", "3", "4", NULL);

        perror("execl failed");
        exit(1);
    }
    else if (pid > 0) {
        // PARENT PROCESS
        wait(&status);

        printf("Parent Process: %d\n", getpid());
        printf("Child PID: %d\n", pid);

        if (WIFEXITED(status)) {
            printf("Child Exit Status: %d\n", WEXITSTATUS(status));
        }
    }
    else {
        perror("fork failed");
        return 1;
    }

    return 0;
}


/*
Multiplication Result: 24
Parent Process
Child PID: 94384
Child Exit Status: 24

*/