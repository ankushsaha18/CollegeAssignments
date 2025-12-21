/* GrepExec.c */
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
    pid_t pid;
    int status;

    if (argc != 3) {
        printf("Usage: %s <pattern> <filename>\n", argv[0]);
        return 1;
    }

    pid = fork();

    if (pid == 0) {
        // CHILD PROCESS
        execl("/bin/grep", "grep", "-n", argv[1], argv[2], NULL);

        perror("execl failed");
        exit(1);
    }
    else if (pid > 0) {
        // PARENT PROCESS
        wait(&status);

        printf("\nParent Process\n");
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
