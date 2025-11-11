#include<stdio.h>
void copystring(char *src,char *dest){
    int i = 0;
    while(src[i] != '\0' && src[i] != '\n'){
        dest[i] = src[i];
        i++;
    }
    dest[i] = '\0';
}
int main(){
    char str[100],copy[100];
    printf("Enter a string to copy: ");
    fgets(str,100,stdin);
    copystring(str,copy);
    printf("Copied string is: %s\n",copy);
    return 0;
}