#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main() {
    int fd1, fd2;
    char buf[100];
    int n;

    fd1 = open("source.txt", O_RDONLY);
    fd2 = open("dest.txt", O_CREAT | O_WRONLY, 0666);

    while ((n = read(fd1, buf, sizeof(buf))) > 0) {
        write(fd2, buf, n);
    }

    close(fd1);
    close(fd2);
    return 0;
}
