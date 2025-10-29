#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);

    int n = strlen(str);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (str[i] == str[j]) {
                printf("The first repetitive character in the string is %c\n", str[i]);
                return 0;
            }
        }
    }

    printf("There is no repetitive character in the string %s.\n", str);
    return 0;
}

/*
Enter a string: hello
The first repetitive character in the string is l
*/
