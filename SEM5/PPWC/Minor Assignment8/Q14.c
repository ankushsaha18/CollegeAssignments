#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t semX, semY, semZ;

void* threadX(void* arg) {
    while (1) {
        sem_wait(&semX);
        printf("X");
        printf("X");
        sem_post(&semY);
    }
}

void* threadY(void* arg) {
    while (1) {
        sem_wait(&semY);
        printf("Y");
        sem_post(&semZ);
    }
}

void* threadZ(void* arg) {
    while (1) {
        sem_wait(&semZ);
        printf("Z");
        printf("Z");
        sem_post(&semX);
    }
}

int main() {
    pthread_t t1, t2, t3;

    sem_init(&semX, 0, 1);
    sem_init(&semY, 0, 0);
    sem_init(&semZ, 0, 0);

    pthread_create(&t1, NULL, threadX, NULL);
    pthread_create(&t2, NULL, threadY, NULL);
    pthread_create(&t3, NULL, threadZ, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);

    return 0;
}
