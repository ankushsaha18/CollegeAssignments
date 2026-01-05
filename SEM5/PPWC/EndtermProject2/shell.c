#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/wait.h>
#include <errno.h>

#define MAX_CMD 1024
#define MAX_ARGS 100

void parse_args(char *cmd, char **args) {
    int i = 0;
    args[i] = strtok(cmd, " \t\n");
    while (args[i] != NULL && i < MAX_ARGS - 1) {
        i++;
        args[i] = strtok(NULL, " \t\n");
    }
}

void handle_redirection(char **args) {
    for (int i = 0; args[i] != NULL; i++) {

        /* Input redirection */
        if (strcmp(args[i], "<") == 0) {
            int fd = open(args[i + 1], O_RDONLY);
            if (fd < 0) {
                perror("input redirection");
                exit(1);
            }
            dup2(fd, STDIN_FILENO);
            close(fd);
            args[i] = NULL;
            return;
        }

        /* Output overwrite */
        if (strcmp(args[i], ">") == 0) {
            int fd = open(args[i + 1], O_WRONLY | O_CREAT | O_TRUNC, 0644);
            if (fd < 0) {
                perror("output redirection");
                exit(1);
            }
            dup2(fd, STDOUT_FILENO);
            close(fd);
            args[i] = NULL;
            return;
        }

        /* Output append */
        if (strcmp(args[i], ">>") == 0) {
            int fd = open(args[i + 1], O_WRONLY | O_CREAT | O_APPEND, 0644);
            if (fd < 0) {
                perror("append redirection");
                exit(1);
            }
            dup2(fd, STDOUT_FILENO);
            close(fd);
            args[i] = NULL;
            return;
        }
    }
}

void execute_pipes(char *cmd) {
    char *commands[10];
    int num_cmds = 0;

    commands[num_cmds] = strtok(cmd, "|");
    while (commands[num_cmds] != NULL && num_cmds < 9) {
        num_cmds++;
        commands[num_cmds] = strtok(NULL, "|");
    }

    int in_fd = STDIN_FILENO;
    int fd[2];
    pid_t pids[10];

    for (int i = 0; i < num_cmds; i++) {
        pipe(fd);

        pids[i] = fork();
        if (pids[i] == 0) {
            dup2(in_fd, STDIN_FILENO);

            if (i != num_cmds - 1)
                dup2(fd[1], STDOUT_FILENO);

            close(fd[0]);
            close(fd[1]);

            char *args[MAX_ARGS];
            parse_args(commands[i], args);
            handle_redirection(args);

            execvp(args[0], args);
            perror("exec failed");
            exit(1);
        }

        close(fd[1]);
        if (in_fd != STDIN_FILENO)
            close(in_fd);
        in_fd = fd[0];
    }

    for (int i = 0; i < num_cmds; i++)
        waitpid(pids[i], NULL, 0);
}

int main() {
    char cmd[MAX_CMD];

    while (1) {

        if (isatty(STDIN_FILENO))
            printf("[myshell]$ ");

        if (!fgets(cmd, MAX_CMD, stdin))
            break;

        if (strncmp(cmd, "exit", 4) == 0)
            break;

        if (strchr(cmd, '|')) {
            execute_pipes(cmd);
        } else {
            pid_t pid = fork();
            if (pid == 0) {
                char *args[MAX_ARGS];
                parse_args(cmd, args);
                handle_redirection(args);
                execvp(args[0], args);
                perror("Command failed");
                exit(1);
            } else {
                waitpid(pid, NULL, 0);
            }
        }
    }
    return 0;
}
