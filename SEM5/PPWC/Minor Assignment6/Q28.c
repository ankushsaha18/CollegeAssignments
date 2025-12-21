#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main(int argc, char *argv[]) {
    int n;
    pid_t pid;

    if (argc != 2) {
        printf("Usage: %s <number_of_terms>\n", argv[0]);
        return 1;
    }

    n = atoi(argv[1]);

    pid = fork();

    if (pid == 0) {   // CHILD PROCESS
        int a = 0, b = 1, c;

        printf("Fibonacci series (%d terms): ", n);

        for (int i = 0; i < n; i++) {
            printf("%d ", a);
            c = a + b;
            a = b;
            b = c;
        }
        printf("\n");
    }
    else if (pid > 0) {   // PARENT PROCESS
        wait(NULL);   // wait for child to finish
        printf("Parent process completed.\n");
    }
    else {
        perror("fork failed");
        return 1;
    }

    return 0;
}


/*
ankushsaha@Ankushs-MacBook-Air Minor Assignment6 % ./a.out 5
Fibonacci series (5 terms): 0 1 1 2 3 
Parent process completed.

*/