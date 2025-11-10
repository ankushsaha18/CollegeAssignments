#include <stdio.h>
#include <unistd.h>
int main(void){
    int x[] = {10, 20, fork(), fork() + fork()};
    int len = sizeof(x) / sizeof(int);
    for (int i = 0; i < len; i++)
        fprintf(stderr, " %d ", x[i]);
    printf("\n");
    return 0;
}

/*
 10  20  0  147149 
 10  20  0  73574 
 10  20  73572  73577 
 10  20  73572  73573 
 10  20  73572  147149 
 10  20  0  73578 
 10  20  73572  0 
 10  20  0  0 
*/