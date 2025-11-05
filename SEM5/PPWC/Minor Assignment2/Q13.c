#include <stdio.h>

int main(){
    char choice;
    int n, i, j;

    printf("Enter the choice of the character: ");
    scanf(" %c", &choice);

    n = choice - 'A' + 1;

    for (i = 0; i < n; i++){
        for (j = 0; j < n - i; j++){
            printf("%c ", 'A' + j);
        }
        for (j = 0; j < 2 * i - 1; j++){
            printf("  ");
        }
        int endstart = (i == 0) ? n - i - 2 : n - i - 1;
        for (j = endstart; j >= 0; j--){
            printf("%c ", 'A' + j);
        }
        printf("\n");
    }
    return 0;
}


/*
Enter the choice of the character: G
A B C D E F G F E D C B A 
A B C D E F   F E D C B A 
A B C D E       E D C B A 
A B C D           D C B A 
A B C               C B A 
A B                   B A 
A                       A 
*/