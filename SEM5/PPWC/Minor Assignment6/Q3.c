#include <stdio.h>
#include <unistd.h>
int main(void){
    printf("A");
    fork();
    printf("P\n");
    return 0;
}

// Because stdout is buffered, the buffered “A” gets duplicated across both processes during fork(), so each prints “AP”.
// Use \n with A to flush the buffer before fork() to avoid mismatch