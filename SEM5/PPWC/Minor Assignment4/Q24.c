#include <stdio.h>

int main() {
    char str[100];
    char *left, *right;
    char temp;

    printf("Enter a string: ");
    fgets(str, sizeof(str), stdin);  
    left = str;                        
    right = str;
    while (*right != '\n' && *right != '\0') {
        right++;
    }
    right--;       

    while (left < right) {
        temp = *left;
        *left = *right;
        *right = temp;

        left++;
        right--;
    }
    printf("Reversed string: %s",str);
    return 0;
}

/*
Enter a string: Hello
Reversed string: olleH
*/