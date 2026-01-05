#include <stdio.h>
#include <unistd.h>
#include <semaphore.h>
#include <sys/wait.h>

sem_t sync;

int main() {
    pid_t pid;
    sem_init(&sync, 0, 0);

    pid = fork();

    if (pid == 0) {
        sem_wait(&sync); 
        printf("Process 2: b executed\n");
    } else {
        printf("Process 1: a executed\n");
        sem_post(&sync);    
        wait(NULL);
    }
    sem_destroy(&sync);
    return 0;
}
