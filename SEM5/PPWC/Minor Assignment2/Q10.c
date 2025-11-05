#include <stdio.h>
int main()
{
    int a = 10;
    if (a = 0)
    {
        printf("%ld %ld", sizeof(2.3f), sizeof(2.3));
    }
    return (0);
}

// as assignment operator is used in if condition so it will assign 0 to a
// and then check the condition if(0) which is false so nothing will be printed