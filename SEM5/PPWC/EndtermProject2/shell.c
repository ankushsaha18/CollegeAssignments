#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/wait.h>

#define MAX_CMD 1024
#define MAX_ARGS 100


void parse_args(char *cmd, char **args) {
    int i = 0;
    args[i] = strtok(cmd, " \t\n");
    while (args[i] != NULL) {
        i++;
        args[i] = strtok(NULL, " \t\n");
    }
}


void handle_redirection(char **args) {
    for (int i = 0; args[i] != NULL; i++) {


        if (strcmp(args[i], "<") == 0) {
            int fd = open(args[i + 1], O_RDONLY);
            dup2(fd, STDIN_FILENO);
            close(fd);
            args[i] = NULL;
        }


        if (strcmp(args[i], ">") == 0) {
            int fd = open(args[i + 1], O_WRONLY | O_CREAT | O_TRUNC, 0644);
            dup2(fd, STDOUT_FILENO);
            close(fd);
            args[i] = NULL;
        }


        if (strcmp(args[i], ">>") == 0) {
            int fd = open(args[i + 1], O_WRONLY | O_CREAT | O_APPEND, 0644);
            dup2(fd, STDOUT_FILENO);
            close(fd);
            args[i] = NULL;
        }
    }
}


void execute_pipes(char *cmd) {
    char *commands[10];
    int num_cmds = 0;
    int fd[2], in_fd = 0;

    commands[num_cmds] = strtok(cmd, "|");
    while (commands[num_cmds] != NULL) {
        num_cmds++;
        commands[num_cmds] = strtok(NULL, "|");
    }

    for (int i = 0; i < num_cmds; i++) {
        pipe(fd);

        if (fork() == 0) {
            dup2(in_fd, STDIN_FILENO);
            if (i != num_cmds - 1)
                dup2(fd[1], STDOUT_FILENO);

            close(fd[0]);

            char *args[MAX_ARGS];
            parse_args(commands[i], args);
            handle_redirection(args);
            execvp(args[0], args);

            perror("exec failed");
            exit(1);
        } else {
            wait(NULL);
            close(fd[1]);
            in_fd = fd[0];
        }
    }
}

int main() {
    char cmd[MAX_CMD];

    while (1) {
        printf("[myshell]$ ");
        fgets(cmd, MAX_CMD, stdin);

        if (strncmp(cmd, "exit", 4) == 0)
            break;

        if (strchr(cmd, '|')) {
            execute_pipes(cmd);
        } else {
            if (fork() == 0) {
                char *args[MAX_ARGS];
                parse_args(cmd, args);
                handle_redirection(args);
                execvp(args[0], args);
                perror("Command failed");
                exit(1);
            } else {
                wait(NULL);
            }
        }
    }
    return 0;
}
