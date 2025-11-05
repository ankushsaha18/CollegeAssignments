#include<stdio.h>
int main() {
    char a,b,c;

    printf("Enter three characters: ");
    scanf(" %c %c %c", &a, &b, &c);

    printf(" %c %c %c\n", a, b, c);
    

    char string[20];

    printf("Enter three characters: ");
    scanf("%s", string);

    printf("%c %c %c\n", string[0], string[1], string[2]);

    return 0;
}