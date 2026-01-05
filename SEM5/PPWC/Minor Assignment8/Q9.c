#include <stdio.h>
#include <unistd.h>
#include <sys/ipc.h>
#include <sys/shm.h>
#include <sys/wait.h>

int main() {
    int shmid;
    int *shrd;
    int x, y;

    shmid = shmget(IPC_PRIVATE, sizeof(int), IPC_CREAT | 0666);
    shrd = (int *)shmat(shmid, NULL, 0);

    *shrd = 5;  
    printf("Initial value of shrd = %d\n", *shrd);

    if (fork() == 0) {
        x = *shrd;
        x = x + 1;
        sleep(1);
        *shrd = x;
        printf("P1 updated shrd to %d\n", *shrd);
    } else {
        y = *shrd;
        y = y - 1;
        sleep(1);
        *shrd = y;
        printf("P2 updated shrd to %d\n", *shrd);

        wait(NULL);
        printf("Final value of shrd = %d\n", *shrd);

        shmdt(shrd);
        shmctl(shmid, IPC_RMID, NULL);
    }
    return 0;
}
