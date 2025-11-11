#include <stdio.h>
#include <unistd.h>

int main() {
    printf("Hello\n");
    for(int i = 0; i < 3; i++)
        if (fork() == 0)
            printf("World\n");
    return 0;
}
