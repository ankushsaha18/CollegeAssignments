#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
#define SIZE 5

int nums[SIZE] = {0, 1, 2, 3, 4};

int main() {
    int i;
    pid_t pid;

    pid = fork();

    if (pid == 0) {   // CHILD
        for (i = 0; i < SIZE; i++) {
            nums[i] *= nums[i] * -i;
            printf("CHILD:%d ", nums[i]);   /* LINE X */
        }
    }
    else if (pid > 0) {   // PARENT
        wait(NULL);
        for (i = 0; i < SIZE; i++)
            printf("PARENT:%d ", nums[i]); /* LINE Y */
    }
    return 0;
}


/*
CHILD:0 CHILD:-1 CHILD:-8 CHILD:-27 CHILD:-64 PARENT:0 PARENT:1 PARENT:2 PARENT:3 PARENT:4 

*/