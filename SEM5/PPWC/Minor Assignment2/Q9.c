#include <stdio.h>
int main()
{
    int i = 0;
    while (i++)
    {
        printf("%d ", i);
        if (i > 2)
            break;
    }
    return (0);
}

// no output because at initial condition while(0) means false so loop does not run