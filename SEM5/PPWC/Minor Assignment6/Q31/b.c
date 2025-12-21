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
        execlp("grep", "grep", "-n", argv[1], argv[2], NULL);
        perror("execlp failed");
        exit(1);
    } else {
        wait(&status);
        printf("Child PID: %d\n", pid);
        printf("Exit Status: %d\n", WEXITSTATUS(status));
    }
    return 0;
}
