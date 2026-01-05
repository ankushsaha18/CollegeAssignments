#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

#define N 5   // Buffer size

int buffer[N];
int in = 0, out = 0;

sem_t mutex, empty, full;

void* producer(void* arg) {
    int item = 1;
    while (1) {
        sem_wait(&empty);   // wait for empty slot
        sem_wait(&mutex);   // enter critical section

        buffer[in] = item;
        printf("Produced: %d\n", item);
        in = (in + 1) % N;
        item++;

        sem_post(&mutex);   // exit critical section
        sem_post(&full);    // signal full slot
    }
}

void* consumer(void* arg) {
    int item;
    while (1) {
        sem_wait(&full);    // wait for full slot
        sem_wait(&mutex);   // enter critical section

        item = buffer[out];
        printf("Consumed: %d\n", item);
        out = (out + 1) % N;

        sem_post(&mutex);   // exit critical section
        sem_post(&empty);   // signal empty slot
    }
}

int main() {
    pthread_t prod, cons;

    sem_init(&mutex, 0, 1);
    sem_init(&empty, 0, N);
    sem_init(&full, 0, 0);

    pthread_create(&prod, NULL, producer, NULL);
    pthread_create(&cons, NULL, consumer, NULL);

    pthread_join(prod, NULL);
    pthread_join(cons, NULL);

    return 0;
}
