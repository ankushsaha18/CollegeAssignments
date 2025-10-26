#include <stdio.h>
int main()
{
    int count = 6;
    while (--count + 1)
        ;
    printf("count down is %d\n", count);
    return 0;
}

// count down is -1