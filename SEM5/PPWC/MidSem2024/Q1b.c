#include<stdio.h>
int main() {
    int a = 0x80ec;
    float b = 0.3e-12;
    printf(":%#X: :%.2E:", a, b);
    return 0;
}