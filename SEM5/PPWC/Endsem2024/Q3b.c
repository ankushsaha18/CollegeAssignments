#include<stdio.h>
int stringlength(char *str){
    int i = 0;
    while(str[i] != '\0' && str[i] != '\n'){
        i++;
    }
    return i;
}
int main(){
    char str[100];
    printf("Enter a string: ");
    fgets(str, 100, stdin);
    int length = stringlength(str);
    printf("Length of the string is: %d\n", length);
    return 0;
}