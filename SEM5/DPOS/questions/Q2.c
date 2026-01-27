#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/wait.h>

int checkPalindrome(char bin[]) {
    int i = 0, j = strlen(bin) - 1;
    while (i < j) {
        if (bin[i] != bin[j])
            return 0;
        i++;
        j--;
    }
    return 1;
}

int main() {
    int n;
    printf("Enter a decimal number: ");
    scanf("%d", &n);

    int fd[2];
    pipe(fd);

    pid_t pid = fork();

    if (pid == 0) {  
        close(fd[0]);
        char bin[32];
        int i = 0;

        while (n > 0) {
            bin[i++] = (n % 2) + '0';
            n /= 2;
        }
        bin[i] = '\0';
        for (int k = 0; k < i / 2; k++) {
            char temp = bin[k];
            bin[k] = bin[i - k - 1];
            bin[i - k - 1] = temp;
        }

        write(fd[1], bin, strlen(bin) + 1);
        close(fd[1]);
        exit(0);

    } else {  
        close(fd[1]);
        char bin[32];
        wait(NULL);
        read(fd[0], bin, sizeof(bin));
        close(fd[0]);

        printf("Binary: %s\n", bin);

        if (checkPalindrome(bin))
            printf("The binary representation is a palindrome.\n");
        else
            printf("The binary representation is not a palindrome.\n");
    }
    return 0;
}
