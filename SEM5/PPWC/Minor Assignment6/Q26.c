#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

/* ---------- Figure (a) ---------- */
void figure_a() {
    pid_t pid;

    printf("\nFIGURE (a)\n");
    printf("P  -> PID=%d PPID=%d\n", getpid(), getppid());

    if ((pid = fork()) == 0) {                 // C1
        printf("C1 -> PID=%d PPID=%d\n", getpid(), getppid());

        if ((pid = fork()) == 0) {             // C2
            printf("C2 -> PID=%d PPID=%d\n", getpid(), getppid());

            if ((pid = fork()) == 0) {         // C3
                printf("C3 -> PID=%d PPID=%d\n", getpid(), getppid());
                return;
            }

            if ((pid = fork()) == 0) {         // C4
                printf("C4 -> PID=%d PPID=%d\n", getpid(), getppid());

                if ((pid = fork()) == 0) {     // C6
                    printf("C6 -> PID=%d PPID=%d\n", getpid(), getppid());
                    return;
                }
                wait(NULL);
                return;
            }

            if ((pid = fork()) == 0) {         // C5
                printf("C5 -> PID=%d PPID=%d\n", getpid(), getppid());
                return;
            }

            while (wait(NULL) > 0);
            return;
        }
        wait(NULL);
        return;
    }
    wait(NULL);
}

/* ---------- Figure (b) ---------- */
void figure_b() {
    pid_t pid;

    printf("\nFIGURE (b)\n");
    printf("P  -> PID=%d PPID=%d\n", getpid(), getppid());

    for (int i = 1; i <= 4; i++) {

        if ((pid = fork()) == 0) {             // Main chain Ci
            printf("C%d -> PID=%d PPID=%d\n", i, getpid(), getppid());

            if ((pid = fork()) == 0) {         // Side child Si
                printf("S%d -> PID=%d PPID=%d\n", i, getpid(), getppid());
                return;
            }
            wait(NULL);
        } else {
            wait(NULL);
            return;
        }
    }
}


int main() {
    figure_a();
    figure_b();
    return 0;
}
