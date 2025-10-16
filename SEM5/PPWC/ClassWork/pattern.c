#include<stdio.h>
int main(){
    int n;
    printf("Enter the number of rows: ");
    scanf("%d",&n);
    for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < n-i ; j++){
            printf("%c",'A'+j);
        }
        for(int j = 1 ; j <= (2*i)-1;j++){
            printf(" ");
        }
        for(int j = n-i-1; j >= 0 ; j--){
            if(i == 0 && j == n-1) continue;
            printf("%c",'A'+j);
        }
        printf("\n");
    }
}

/*

Enter the number of rows: 7
ABCDEFGFEDCBA
ABCDEF FEDCBA
ABCDE   EDCBA
ABCD     DCBA
ABC       CBA
AB         BA
A           A

*/