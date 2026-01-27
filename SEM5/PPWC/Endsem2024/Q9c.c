#include <stdio.h>
#include <unistd.h>
#include <ctype.h>
#include <string.h>

int main() {
    int p1[2], p2[2];
    char str[100];

    pipe(p1);
    pipe(p2);

    if (fork() == 0) {   // Child
        close(p1[1]);
        close(p2[0]);

        read(p1[0], str, sizeof(str));
        for (int i = 0; str[i]; i++)
            str[i] = toupper(str[i]);

        write(p2[1], str, strlen(str)+1);
    } else {            // Parent
        close(p1[0]);
        close(p2[1]);

        write(p1[1], "hello", 6);
        read(p2[0], str, sizeof(str));
        printf("%s\n", str);
    }
    return 0;
}
