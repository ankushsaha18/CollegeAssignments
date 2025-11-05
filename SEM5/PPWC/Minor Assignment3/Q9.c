#include<stdio.h>
#include<string.h>

int main(){
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);
    int n = strlen(str);
    int occurence[256] = {0};
    for(int i = 0; i < n; i++){
        occurence[str[i]]++;
    }
    printf("Character occurrences:\n");
    for(int i = 0; i < 256; i++){
        if(occurence[i] > 0){
            printf("%c: %d\n", i, occurence[i]);
        }
    }

    return 0;
}