#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t semA, semB, semC;

void* threadA(void* arg) {
    for (int i = 1; i <= 19; i += 3) {
        sem_wait(&semA);
        printf("A%d\n", i);
        sem_post(&semB);
    }
    pthread_exit(NULL);
}

void* threadB(void* arg) {
    for (int i = 2; i <= 20; i += 3) {
        sem_wait(&semB);
        printf("B%d\n", i);
        sem_post(&semC);
    }
    pthread_exit(NULL);
}

void* threadC(void* arg) {
    for (int i = 3; i <= 18; i += 3) {
        sem_wait(&semC);
        printf("C%d\n", i);
        sem_post(&semA);
    }
    pthread_exit(NULL);
}

int main() {
    pthread_t tA, tB, tC;

    sem_init(&semA, 0, 1);  
    sem_init(&semB, 0, 0);
    sem_init(&semC, 0, 0);

    pthread_create(&tA, NULL, threadA, NULL);
    pthread_create(&tB, NULL, threadB, NULL);
    pthread_create(&tC, NULL, threadC, NULL);

    pthread_join(tA, NULL);
    pthread_join(tB, NULL);
    pthread_join(tC, NULL);

    sem_destroy(&semA);
    sem_destroy(&semB);
    sem_destroy(&semC);

    return 0;
}
