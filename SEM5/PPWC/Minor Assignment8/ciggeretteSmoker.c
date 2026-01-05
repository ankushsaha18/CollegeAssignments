#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>
#include <stdlib.h>

sem_t agentSem;
sem_t tobaccoSem, paperSem, matchesSem;

void* agent(void* arg) {
    while (1) {
        sem_wait(&agentSem);

        int r = rand() % 3;

        if (r == 0) {
            printf("Agent puts Paper and Matches\n");
            sem_post(&tobaccoSem);
        }
        else if (r == 1) {
            printf("Agent puts Tobacco and Matches\n");
            sem_post(&paperSem);
        }
        else {
            printf("Agent puts Tobacco and Paper\n");
            sem_post(&matchesSem);
        }
    }
}

void* smoker_tobacco(void* arg) {
    while (1) {
        sem_wait(&tobaccoSem);
        printf("Smoker with Tobacco makes and smokes cigarette\n");
        sleep(1);
        sem_post(&agentSem);
    }
}

void* smoker_paper(void* arg) {
    while (1) {
        sem_wait(&paperSem);
        printf("Smoker with Paper makes and smokes cigarette\n");
        sleep(1);
        sem_post(&agentSem);
    }
}

void* smoker_matches(void* arg) {
    while (1) {
        sem_wait(&matchesSem);
        printf("Smoker with Matches makes and smokes cigarette\n");
        sleep(1);
        sem_post(&agentSem);
    }
}

int main() {
    pthread_t agentThread, tThread, pThread, mThread;

    sem_init(&agentSem, 0, 1);
    sem_init(&tobaccoSem, 0, 0);
    sem_init(&paperSem, 0, 0);
    sem_init(&matchesSem, 0, 0);

    pthread_create(&agentThread, NULL, agent, NULL);
    pthread_create(&tThread, NULL, smoker_tobacco, NULL);
    pthread_create(&pThread, NULL, smoker_paper, NULL);
    pthread_create(&mThread, NULL, smoker_matches, NULL);

    pthread_join(agentThread, NULL);

    return 0;
}
