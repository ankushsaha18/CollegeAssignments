#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/wait.h>
#include <unistd.h>

int main() {
    int shmid;
    int *data;
    pid_t pid;

    shmid = shmget(IPC_PRIVATE, sizeof(int), IPC_CREAT | 0666);
    data = (int *)shmat(shmid, NULL, 0);

    pid = fork();

    if (pid == 0) {
        *data = 10;
        printf("Child sent number: %d\n", *data);

        sleep(1); 

        printf("Child received doubled value: %d\n", *data);

        shmdt(data);
    } else {
        wait(NULL);

        printf("Parent received number: %d\n", *data);
        *data = (*data) * 2;
        printf("Parent sent doubled value: %d\n", *data);

        shmdt(data);
        shmctl(shmid, IPC_RMID, NULL);
    }

    return 0;
}
