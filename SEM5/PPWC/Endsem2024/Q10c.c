#include<stdio.h>
#include<semaphore.h>
#include<pthread.h>

sem_t s,t;

void* p1(){
    sem_wait(&s);
    fprintf(stderr,"0");
    sem_post(&s);
    sem_post(&t);
}

void* p2(){
    sem_wait(&t);
    fprintf(stderr,"1");
    sem_post(&s);
}

int main(){
    sem_init(&s,0,2);
    sem_init(&t,0,0);

    pthread_t th1,th2;
    pthread_create(&th1,NULL,p1,NULL);
    pthread_create(&th2,NULL,p2,NULL);

    pthread_join(th1,NULL);
    pthread_join(th2,NULL);

    return 0;
}