#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>

struct msgbuf {
    long mtype;
    char mtext[50];
};

int main() {
    int msqid;
    struct msgbuf msg;

    msqid = msgget(1234, 0666);

    printf("Receiving messages:\n");

    while (msgrcv(msqid, &msg, sizeof(msg.mtext), 0, IPC_NOWAIT) != -1) {
        printf("%s\n", msg.mtext);
    }

    msgctl(msqid, IPC_RMID, NULL);
    return 0;
}
