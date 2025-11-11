#include<stdio.h>
int main(){
    int n;
    printf("Enter size:");
    scanf("%d", &n);
    int arr[n];
    printf("Enter elements:");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }
    int i = 0;
    int j = n-1;
    while(i < j){
        while(arr[i] < 0 && i < j) i++;
        while(arr[j] >= 0 && i < j) j--;
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
    return 0;
}