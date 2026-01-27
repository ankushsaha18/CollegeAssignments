#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/wait.h>

void sort(int n,int *arr){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

int main(){
    pid_t pid = fork();
    if(pid > 0){
        FILE *fp = fopen("unsorted.txt","w");
        int arr[] = {3,5,11,6,4,0,9};
        for(int i = 0 ; i < 7 ; i++){
            fprintf(fp,"%d ",arr[i]);
        }
        printf("Parent process wrote unsorted numbers to file.\n");
        fclose(fp);
        wait(NULL);
    }else{
        FILE *fc = fopen("unsorted.txt","r");
        int arr[7];
        for(int i = 0 ; i < 7 ; i++){
            fscanf(fc,"%d",&arr[i]);
        }
        printf("Child process read numbers from file and is sorting them.\n");
        fclose(fc);
        sort(7,arr);
        FILE *fs = fopen("sorted.txt","w");
        for(int i = 0 ; i < 7 ; i++){
            fprintf(fs,"%d ",arr[i]);
        }
        fclose(fs);
        printf("Child process wrote sorted numbers to file.\n");
    }
    return 0;
}