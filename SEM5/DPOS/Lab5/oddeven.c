#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>

sem_t odd_sem, even_sem;

void* print_odd(void* arg) {
    for (int i = 1; i <= 19; i += 2) {
        sem_wait(&odd_sem);
        printf("%d\n", i);
        sem_post(&even_sem);
    }
    pthread_exit(NULL);
}

void* print_even(void* arg) {
    for (int i = 2; i <= 20; i += 2) {
        sem_wait(&even_sem);
        printf("%d\n", i);
        sem_post(&odd_sem);
    }
    pthread_exit(NULL);
}

int main() {
    pthread_t t1, t2;

    sem_init(&odd_sem, 0, 1);   
    sem_init(&even_sem, 0, 0);  

    pthread_create(&t1, NULL, print_odd, NULL);
    pthread_create(&t2, NULL, print_even, NULL);

    pthread_join(t1, NULL);
    pthread_join(t2, NULL);

    sem_destroy(&odd_sem);
    sem_destroy(&even_sem);

    return 0;
}
