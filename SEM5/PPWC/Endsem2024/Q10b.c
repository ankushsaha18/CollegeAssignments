#include<stdio.h>
#include<semaphore.h>

int main(){
    sem_t s = 10;
    printf("Semaphore initialized with value: %d\n", s);
    sem_wait(&s);
    sem_wait(&s);
    sem_post(&s);
    sem_post(&s);
    sem_wait(&s);
    printf("Final semaphore value: %d\n", s);
    return 0;
}