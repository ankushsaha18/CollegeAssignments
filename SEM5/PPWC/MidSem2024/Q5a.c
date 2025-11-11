#include<stdio.h>
void sortwsalsg(int *x,int *y){
    if(*x>*y){
        int temp=*x;
        *x=*y;
        *y=temp;
    }
}
int main(){
    int n=5;
    int a,b,c,d,e;
    printf("Enter 5 numbers: ");
    scanf("%d %d %d %d %d",&a,&b,&c,&d,&e);
    for(int i=0;i<n-1;i++){
        sortwsalsg(&a,&b);
        sortwsalsg(&b,&c);
        sortwsalsg(&c,&d);
        sortwsalsg(&d,&e);
    }
    printf("Sorted numbers: %d %d %d %d %d\n",a,b,c,d,e);
    return 0;

}