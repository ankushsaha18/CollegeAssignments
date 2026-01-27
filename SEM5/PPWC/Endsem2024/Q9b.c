#include <stdio.h>
#include <unistd.h>

int main() {
    int fd[2];
    pipe(fd);

    if (fork() == 0) {                 // Child
        int n, x;
        close(fd[0]);

        scanf("%d", &n);
        write(fd[1], &n, sizeof(n));

        for (int i = 0; i < n; i++) {
            scanf("%d", &x);
            write(fd[1], &x, sizeof(x));
        }

        close(fd[1]);
    } else {                            // Parent
        int n, x, sum = 0;
        close(fd[1]);

        read(fd[0], &n, sizeof(n));

        for (int i = 0; i < n; i++) {
            read(fd[0], &x, sizeof(x));
            sum += x;
        }

        printf("Mean = %f\n", (float)sum / n);
        close(fd[0]);
    }
    return 0;
}
