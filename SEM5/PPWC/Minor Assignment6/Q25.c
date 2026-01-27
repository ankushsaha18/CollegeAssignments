#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t pid;

    printf("START -> PID=%d PPID=%d\n", getpid(), getppid());

    // C1
    if ((pid = fork()) == 0) {
        printf("C1 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());
        return 0;
    }

    // C2
    if ((pid = fork()) == 0) {
        printf("C2 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());

        // C4
        if ((pid = fork()) == 0) {
            printf("C4 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());
            return 0;
        }

        // C5
        if ((pid = fork()) == 0) {
            printf("C5 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());

            // C6
            if ((pid = fork()) == 0) {
                printf("C6 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());

                // C7
                if ((pid = fork()) == 0) {
                    printf("C7 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());
                    return 0;
                }
                wait(NULL);
                return 0;
            }
            wait(NULL);
            return 0;
        }

        wait(NULL);
        wait(NULL);
        return 0;
    }

    // C3
    if ((pid = fork()) == 0) {
        printf("C3 -> PID=%d PPID=%d fork=0\n", getpid(), getppid());
        return 0;
    }

    // Parent waits
    while (wait(NULL) > 0);
    sleep(15);
    return 0;
}


/*

START -> PID=86665 PPID=86385
C1 -> PID=86668 PPID=86665 fork=0
C2 -> PID=86669 PPID=86665 fork=0
C3 -> PID=86670 PPID=86665 fork=0
C4 -> PID=86671 PPID=86669 fork=0
C5 -> PID=86672 PPID=86669 fork=0
C6 -> PID=86673 PPID=86672 fork=0
C7 -> PID=86674 PPID=86673 fork=0

*/