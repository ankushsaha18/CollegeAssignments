#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main() {
    int fd;
    char buf[20];

    fd = open("test.txt", O_CREAT | O_RDWR, 0644);
    write(fd, "HELLO", 5);
    close(fd);
    fd = open("test.txt", O_RDONLY);
    read(fd, buf, 5);
    buf[5] = '\0';
    printf("%s", buf);
    close(fd);
    return 0;
}
