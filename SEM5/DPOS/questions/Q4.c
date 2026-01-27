#include<stdio.h>
#include<stdlib.h>
#include<semaphore.h>
#include<pthread.h>
#include<unistd.h>
#include<sys/wait.h>

sem_t s1,s2,s3;
int count;

void* threadA(void* arg){
    while(count <= 20){
        sem_wait(&s1);
        if(count <= 20){
            printf("A%d ",count);
            count++;
        }
        sem_post(&s3);
    }
}

void* threadB(void* arg){
    while(count <= 20){
        sem_wait(&s2);
        if(count <= 20){
            printf("B%d ",count);
            count++;
        }
        sem_post(&s1);
    }
}

void* threadC(void* arg){
    while(count <= 20){
        sem_wait(&s3);
        if(count <= 20){
            printf("C%d ",count);
            count++;
        }
        sem_post(&s2);
    }
}

int main(){
    pthread_t t1,t2,t3;
    count = 1;
    sem_init(&s1,0,0);
    sem_init(&s2,0,0);
    sem_init(&s3,0,1);

    pthread_create(&t1,NULL,threadA,NULL);
    pthread_create(&t2,NULL,threadB,NULL);
    pthread_create(&t3,NULL,threadC,NULL);

    pthread_join(t1,NULL);
    pthread_join(t2,NULL);
    pthread_join(t3,NULL);

    sem_destroy(&s1);
    sem_destroy(&s2);
    sem_destroy(&s3);

    return 0;
}