#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int isPrime(int n) {
    if (n < 2)
        return 0;
    for (int i = 2; i * i <= n; i++)
        if (n % i == 0)
            return 0;
    return 1;
}

int main() {
    int n;
    printf("Enter length of Fibonacci series: ");
    scanf("%d", &n);

    if (n <= 0) {
        printf("Invalid length\n");
        return 1;
    }

    pid_t pid = fork();

    if (pid == 0) {
        int fib[n];
        fib[0] = 0;
        if (n > 1)
            fib[1] = 1;

        for (int i = 2; i < n; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        FILE *fp = fopen("fib.txt", "w");
        if (!fp) {
            perror("File error");
            exit(1);
        }

        for (int i = 0; i < n; i++)
            fprintf(fp, "%d ", fib[i]);

        fclose(fp);
        exit(0);
    }
    else {
        wait(NULL);

        int fib[n];
        FILE *fp = fopen("fib.txt", "r");
        if (!fp) {
            perror("File error");
            return 1;
        }

        for (int i = 0; i < n; i++)
            fscanf(fp, "%d", &fib[i]);

        fclose(fp);

        printf("\nFibonacci Series:\n");
        for (int i = 0; i < n; i++)
            printf("%d ", fib[i]);

        printf("\n\nPrime Fibonacci Numbers and Their Positions:\n");
        for (int i = 0; i < n; i++)
            if (isPrime(fib[i]))
                printf("Value %d at Position %d\n", fib[i], i);
    }

    return 0;
}
