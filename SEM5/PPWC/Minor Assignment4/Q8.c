#include <stdio.h>

int main() {
    int a[10] = {0,10,20,30,40,50,60,70,80,90};

    printf("Index\tValue\tAddress\n");
    printf("---------------------------\n");

    for (int i = 0; i < 10; i++) {
        printf("%d\t%d\t%p\n", i, a[i], &a[i]);
    }

    return 0;
}

/*
Index   Value   Address
---------------------------
0       0       0x16d482850
1       10      0x16d482854
2       20      0x16d482858
3       30      0x16d48285c
4       40      0x16d482860
5       50      0x16d482864
6       60      0x16d482868
7       70      0x16d48286c
8       80      0x16d482870
9       90      0x16d482874
*/