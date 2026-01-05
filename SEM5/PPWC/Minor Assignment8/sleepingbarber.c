#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define CHAIRS 3   // number of waiting chairs

int waiting = 0;

sem_t customers;
sem_t barber;
sem_t mutex;

void* barber_func(void* arg) {
    while (1) {
        sem_wait(&customers);   // sleep if no customers
        sem_wait(&mutex);

        waiting--;
        printf("Barber is cutting hair. Waiting customers: %d\n", waiting);

        sem_post(&barber);      // barber is ready
        sem_post(&mutex);

        sleep(2);               // cutting hair
    }
}

void* customer_func(void* arg) {
    sem_wait(&mutex);

    if (waiting < CHAIRS) {
        waiting++;
        printf("Customer entered. Waiting customers: %d\n", waiting);

        sem_post(&customers);   // notify barber
        sem_post(&mutex);

        sem_wait(&barber);      // wait for barber
        printf("Customer is getting a haircut\n");
    } else {
        sem_post(&mutex);
        printf("Shop full. Customer leaves\n");
    }

    return NULL;
}

int main() {
    pthread_t barber_thread;
    pthread_t customers_thread[10];

    sem_init(&customers, 0, 0);
    sem_init(&barber, 0, 0);
    sem_init(&mutex, 0, 1);

    pthread_create(&barber_thread, NULL, barber_func, NULL);

    for (int i = 0; i < 10; i++) {
        sleep(1);
        pthread_create(&customers_thread[i], NULL, customer_func, NULL);
    }

    pthread_join(barber_thread, NULL);

    return 0;
}
