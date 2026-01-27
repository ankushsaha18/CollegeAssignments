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
        if((pid = fork()) == 0){
            printf("Side child of P -> PID=%d PPID=%d\n", getpid(), getppid());
            return;
        }
        if((pid = fork()) > 0){
            break;
        }
        printf("P  -> PID=%d PPID=%d\n", getpid(), getppid());
    }
    wait(NULL);
}


int main() {
    figure_b();
    return 0;
}
