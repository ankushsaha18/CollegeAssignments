#include<stdio.h>
#include<string.h>

int check(char *str,char *sub){
    int i,j;
    int len1 = strlen(str);
    int len2 = strlen(sub);
    for(i=0;i<=len1-len2;i++){
        for(j=0;j<len2;j++){
            if(str[i+j] != sub[j]){
                break;
            }
        }
        if(j == len2){
            return 1;
        }
    }
    return 0;
}
int main(){
    char str[100],sub[100];
    printf("Enter the main string: ");
    fgets(str,100,stdin);
    printf("Enter the substring to search: ");
    fgets(sub,100,stdin);
    if(check(str,sub)){
        printf("Substring found in the main string.\n");
    }else{
        printf("Substring not found in the main string.\n");
    }
    return 0;
}