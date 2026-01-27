#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    pid_t c1, c2, c3;

    c1 = fork();
    if (c1 == 0) {
        printf("\nChild 1: PID = %d, PPID = %d\n", getpid(), getppid());

        FILE *f1 = fopen("file1.txt", "r");
        FILE *f2 = fopen("file2.txt", "w");

        if (!f1 || !f2) {
            perror("Error opening files");
            exit(1);
        }

        int ch;
        while ((ch = fgetc(f1)) != EOF)
            fputc(ch, f2);

        fclose(f1);
        fclose(f2);
        exit(0);
    }

    sleep(1);

    c2 = fork();
    if (c2 == 0) {
        printf("\nChild 2: PID = %d, PPID = %d\n", getpid(), getppid());

        FILE *f = fopen("file2.txt", "r");
        if (!f) {
            perror("Error opening file2");
            exit(1);
        }

        int ch;
        while ((ch = fgetc(f)) != EOF)
            putchar(ch);

        fclose(f);
        exit(0);
    }

    sleep(1);

    c3 = fork();
    if (c3 == 0) {
        printf("\nChild 3: PID = %d, PPID = %d\n", getpid(), getppid());
        system("sort file2.txt | tac");
        exit(0);
    }

    sleep(1);

    wait(NULL);
    wait(NULL);
    wait(NULL);

    printf("Parent: All child processes completed. PID = %d\n", getpid());

    return 0;
}
