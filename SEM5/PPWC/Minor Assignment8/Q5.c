#include <stdio.h>
#include <stdlib.h>
#include <sys/ipc.h>
#include <sys/shm.h>

int main() {
    int shmid;
    void *addr1, *addr2, *addr3, *addr4;
    struct shmid_ds shminfo;

    shmid = shmget(IPC_PRIVATE, 10, IPC_CREAT | 0666);
    if (shmid == -1) {
        perror("shmget");
        exit(1);
    }

    addr1 = shmat(shmid, NULL, 0);
    addr2 = shmat(shmid, NULL, 0);
    addr3 = shmat(shmid, NULL, 0);
    addr4 = shmat(shmid, NULL, 0);

    if (addr1 == (void *)-1 || addr2 == (void *)-1 ||
        addr3 == (void *)-1 || addr4 == (void *)-1) {
        perror("shmat");
        exit(1);
    }

    if (shmctl(shmid, IPC_STAT, &shminfo) == -1) {
        perror("shmctl");
        exit(1);
    }

    printf("Current attachments (shm_nattch): %lu\n",
           shminfo.shm_nattch);

    printf("Shared Memory ID: %d\n", shmid);
    printf("Check using: ipcs -m\n");

    printf("Press Enter to detach and remove shared memory...\n");
    getchar();

    shmdt(addr1);
    shmdt(addr2);
    shmdt(addr3);
    shmdt(addr4);

    shmctl(shmid, IPC_RMID, NULL);
    return 0;
}
