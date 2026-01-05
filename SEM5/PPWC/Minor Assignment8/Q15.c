#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#include <semaphore.h>
#include <fcntl.h>

int main() {
    sem_t *s1, *s2, *s3, *s4, *s5;

    s1 = sem_open("/s1", O_CREAT, 0666, 0);
    s2 = sem_open("/s2", O_CREAT, 0666, 1);
    s3 = sem_open("/s3", O_CREAT, 0666, 0);
    s4 = sem_open("/s4", O_CREAT, 0666, 0);
    s5 = sem_open("/s5", O_CREAT, 0666, 0);

    pid_t p;

    if ((p = fork()) == 0) {
        sem_wait(s1);
        fprintf(stderr, "Distance ");
        sem_post(s3);
    }
    else if ((p = fork()) == 0) {
        sem_wait(s2);
        fprintf(stderr, "KEEP ");
        sem_post(s1);
    }
    else if ((p = fork()) == 0) {
        sem_wait(s3);
        fprintf(stderr, "Smart ");
        sem_post(s4);
    }
    else if ((p = fork()) == 0) {
        sem_wait(s4);
        fprintf(stderr, "From ");
        sem_post(s5);
    }
    else if ((p = fork()) == 0) {
        sem_wait(s5);
        fprintf(stderr, "Devices\n");
    }
    else {
        for (int i = 0; i < 5; i++)
            wait(NULL);

        sem_unlink("/s1");
        sem_unlink("/s2");
        sem_unlink("/s3");
        sem_unlink("/s4");
        sem_unlink("/s5");
    }

    return 0;
}
