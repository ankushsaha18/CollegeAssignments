#include <stdio.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <string.h>

struct msgbuf {
    long mtype;
    char mtext[50];
};

int main() {
    int msqid;
    struct msgbuf msg;

    msqid = msgget(1234, IPC_CREAT | 0666);

    msg.mtype = 1;

    strcpy(msg.mtext, "Message 1");
    msgsnd(msqid, &msg, sizeof(msg.mtext), 0);

    strcpy(msg.mtext, "Message 2");
    msgsnd(msqid, &msg, sizeof(msg.mtext), 0);

    strcpy(msg.mtext, "Message 3");
    msgsnd(msqid, &msg, sizeof(msg.mtext), 0);

    strcpy(msg.mtext, "Message 4");
    msgsnd(msqid, &msg, sizeof(msg.mtext), 0);

    printf("4 messages sent to queue\n");
    return 0;
}
