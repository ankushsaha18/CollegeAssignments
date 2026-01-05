#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid;
    int *data;

    shmid = shmget(1234, sizeof(int), IPC_CREAT | 0666);
    data = (int *)shmat(shmid, NULL, 0);

    *data = 500;
    printf("Writer wrote value: %d\n", *data);

    getchar();

    printf("Writer reads updated value: %d\n", *data);

    shmdt(data);
    return 0;
}
