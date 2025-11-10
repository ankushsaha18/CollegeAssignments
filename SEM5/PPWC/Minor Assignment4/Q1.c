#include <stdio.h>
int main() {
    int Ia = 345;        // integer variable
    float Fb = 4.5;      // float variable
    char Chvar = 'Z';    // char variable

    printf("Ia value = %d\t address = %p\n", Ia, &Ia);
    printf("Fb value = %.2f\t address = %p\n", Fb, &Fb);
    printf("Chvar value = %c\t address = %p\n", Chvar,&Chvar);

    return 0;
}

/*
Ia value = 345   address = 0x16d77e908
Fb value = 4.50  address = 0x16d77e904
Chvar value = Z  address = 0x16d77e903
*/