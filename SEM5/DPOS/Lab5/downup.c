#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t down_sem, up_sem;

void* countdown(void* arg) {
    for (int i = 10; i >= 1; i--) {
        sem_wait(&down_sem);
        printf("Countdown: %d\n", i);
        sem_post(&up_sem);
    }
    pthread_exit(NULL);
}

void* countup(void* arg) {
    for (int i = 1; i <= 10; i++) {
        sem_wait(&up_sem);
        printf("Countup: %d\n", i);
        sem_post(&down_sem);
    }
    pthread_exit(NULL);
}

int main() {
    pthread_t t1, t2;

    sem_init(&down_sem, 0, 1); // Countdown starts
    sem_init(&up_sem, 0, 0);

    pthread_create(&t1, NULL, countdown, NULL);
    pthread_create(&t2, NULL, countup, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    sem_destroy(&down_sem);
    sem_destroy(&up_sem);

    return 0;
}
