#include <stdio.h>
void fun(int b[]) {
    printf("%ld\n", sizeof(b)/sizeof(b[0]));
}
int main() {
    int a[5] = {2, 3};
    printf("%ld\n", sizeof(a)/sizeof(a[0]));
    fun(a);
}
