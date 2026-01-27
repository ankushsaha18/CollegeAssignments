#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t semA, semB;

void* printA(void* arg) {
    for (int i = 0; i < 10; i++) {
        sem_wait(&semA);
        printf("A");
        sem_post(&semB);
    }
    pthread_exit(NULL);
}

void* printB(void* arg) {
    for (int i = 0; i < 10; i++) {
        sem_wait(&semB);
        printf("B");
        sem_post(&semA);
    }
    pthread_exit(NULL);
}

int main() {
    pthread_t t1, t2;

    sem_init(&semA, 0, 1);  // A starts first
    sem_init(&semB, 0, 0);

    pthread_create(&t1, NULL, printA, NULL);
    pthread_create(&t2, NULL, printB, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    sem_destroy(&semA);
    sem_destroy(&semB);

    return 0;
}
