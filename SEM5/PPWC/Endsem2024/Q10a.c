#include<stdio.h>
#include<semaphore.h>

int main(){
    sem_t s = 10;
    printf("Semaphore initialized with value: %d\n", s);
    return 0;
}