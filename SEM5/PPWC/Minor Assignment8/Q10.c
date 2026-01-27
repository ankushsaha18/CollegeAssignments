#include <stdio.h>
#include <unistd.h>
#include <semaphore.h>
#include <sys/wait.h>

sem_t s;

int main() {
    pid_t pid;
    sem_init(&s, 0, 0);

    pid = fork();

    if (pid == 0) {
        sem_wait(&s); 
        printf("Process 2: b executed\n");
    } else {
        printf("Process 1: a executed\n");
        sem_post(&s);    
        wait(NULL);
    }
    sem_destroy(&s);
    return 0;
}
