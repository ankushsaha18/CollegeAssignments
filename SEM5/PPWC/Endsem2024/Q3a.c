#include<stdio.h>
int check(char *str,char *sub){
    int i,j;
    for(i=0;str[i]!='\0' || str[i]!='\n';i++){
        for(j=0;sub[j]!='\0' || sub[j]!='\n';j++){
            if(str[i+j]!=sub[j]){
                break;
            }
        }
        if(sub[j]=='\0' || sub[j]=='\n'){
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