#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    int shmid = shmget(IPC_PRIVATE, sizeof(int), IPC_CREAT | 0666);
    int *num = (int *)shmat(shmid, NULL, 0);

    pid_t pid = fork();

    if (pid == 0) {                  // Child
        *num = 10;
        printf("Child sent number: %d\n", *num);
        return 0;
    }

    wait(NULL);                      // Parent waits for child

    printf("Parent received number: %d\n", *num);
    *num = (*num) * 2;
    printf("Parent sent doubled value: %d\n", *num);

    pid = fork();                    // Second child to read back

    if (pid == 0) {
        printf("Child received doubled value: %d\n", *num);
        return 0;
    }

    wait(NULL);
    return 0;
}
