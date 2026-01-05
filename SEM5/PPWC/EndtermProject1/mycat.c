#include <stdio.h>
#include <unistd.h>
#include <fcntl.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#define BUF_SIZE 1024

void print_with_line_numbers(int fd) {
    char buf[BUF_SIZE];
    int bytes;
    int line = 1;
    int new_line = 1;

    while ((bytes = read(fd, buf, BUF_SIZE)) > 0) {
        for (int i = 0; i < bytes; i++) {
            if (new_line) {
                char ln[20];
                int len = sprintf(ln, "%4d  ", line++);
                write(STDOUT_FILENO, ln, len);
                new_line = 0;
            }
            write(STDOUT_FILENO, &buf[i], 1);
            if (buf[i] == '\n')
                new_line = 1;
        }
    }
}

void simple_cat(int fd) {
    char buf[BUF_SIZE];
    int bytes;

    while ((bytes = read(fd, buf, BUF_SIZE)) > 0) {
        write(STDOUT_FILENO, buf, bytes);
    }
}

int main(int argc, char *argv[]) {
    int fd;
    int line_number = 0;


    if (argc == 1) {
        simple_cat(STDIN_FILENO);
        return 0;
    }


    if (strcmp(argv[1], "-n") == 0) {
        line_number = 1;
        if (argc == 2) {
            print_with_line_numbers(STDIN_FILENO);
            return 0;
        }
        for (int i = 2; i < argc; i++) {
            fd = open(argv[i], O_RDONLY);
            if (fd < 0) {
                perror(argv[i]);
                continue;
            }
            print_with_line_numbers(fd);
            close(fd);
        }
        return 0;
    }


    if (strcmp(argv[1], "<") == 0 && argc == 3) {
        fd = open(argv[2], O_RDONLY);
        if (fd < 0) {
            perror("Input redirection failed");
            exit(1);
        }
        dup2(fd, STDIN_FILENO);
        close(fd);
        simple_cat(STDIN_FILENO);
        return 0;
    }


    if (strcmp(argv[1], ">") == 0 && argc == 3) {
        fd = open(argv[2], O_WRONLY | O_CREAT | O_TRUNC, 0644);
        if (fd < 0) {
            perror("Output redirection failed");
            exit(1);
        }
        dup2(fd, STDOUT_FILENO);
        close(fd);
        simple_cat(STDIN_FILENO);
        return 0;
    }


    if (strcmp(argv[1], ">>") == 0 && argc == 3) {
        fd = open(argv[2], O_WRONLY | O_CREAT | O_APPEND, 0644);
        if (fd < 0) {
            perror("Append redirection failed");
            exit(1);
        }
        dup2(fd, STDOUT_FILENO);
        close(fd);
        simple_cat(STDIN_FILENO);
        return 0;
    }


    for (int i = 1; i < argc; i++) {
        fd = open(argv[i], O_RDONLY);
        if (fd < 0) {
            perror(argv[i]);
            continue;
        }
        simple_cat(fd);
        close(fd);
    }

    return 0;
}
