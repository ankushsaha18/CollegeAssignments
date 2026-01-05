#include <stdio.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid;
    int *data;

    shmid = shmget(1234, sizeof(int), 0666);
    data = (int *)shmat(shmid, NULL, 0);

    printf("Reader read value: %d\n", *data);

    *data = 600;
    printf("Reader updated value to: %d\n", *data);

    shmdt(data);
    return 0;
}
