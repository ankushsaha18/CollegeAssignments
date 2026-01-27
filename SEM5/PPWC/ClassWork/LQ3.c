#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t S1, S2, S3;

void *p1(void *arg) {
    for (char c = 'A'; c <= 'Z'; c++) {
        sem_wait(&S1);
        printf("%c ", c);
        fflush(stdout);
        sem_post(&S2);
    }
    return NULL;
}

void *p2(void *arg) {
    for (char c = 'a'; c <= 'z'; c++) {
        sem_wait(&S2);
        printf("%c ", c);
        fflush(stdout);
        sem_post(&S3);
    }
    return NULL;
}

void *p3(void *arg) {
    for (int i = 1; i <= 26; i++) {
        sem_wait(&S3);
        printf("%d ", i);
        fflush(stdout);
        sem_post(&S1);
    }
    return NULL;
}

int main() {
    pthread_t t1, t2, t3;

    sem_init(&S1, 0, 1);
    sem_init(&S2, 0, 0);
    sem_init(&S3, 0, 0);

    pthread_create(&t1, NULL, p1, NULL);
    pthread_create(&t2, NULL, p2, NULL);
    pthread_create(&t3, NULL, p3, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);
    pthread_join(t3, NULL);

    return 0;
}
