#include <stdio.h>
int main() {
    char s1[] = "mine";
    char s2[] = "cs";
    char s3[] = "sc";
    char s4[] = "soa";
    char *argv[] = { s1, s2, s3, s4, NULL };
    char **p = argv;
    while (*p != NULL) {
        char *str = *p; 
        while (*str != '\0') {
            if (*str >= 'a' && *str <= 'z') {
                *str = *str - 32; 
            }
            str++;
        }
        p++;
    }
    printf("Strings after conversion:\n");
    for (int i = 0; argv[i] != NULL; i++) {
        printf("%s\n", argv[i]);
    }
    return 0;
}

/*
Strings after conversion:
MINE
CS
SC
SOA
*/