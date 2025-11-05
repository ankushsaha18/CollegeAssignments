#include <stdio.h>

int main() {
    int prime_lt_100[] = {2, 3, 5, 7, 11, 13, 17,
        19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
        61, 67, 71, 73, 79, 83, 89, 97};
    int i = 10;
    int a, b, c;

    // (a)
    a = prime_lt_100[24];
    printf("(a) prime_lt_100[24] = %d\n", a);

    // (b)
    b = prime_lt_100[i + 4];
    printf("(b) prime_lt_100[i+4] = %d\n", b);

    // (c)
    c = prime_lt_100[prime_lt_100[2] + prime_lt_100[0]];
    printf("(c) prime_lt_100[prime_lt_100[2] + prime_lt_100[0]] = %d\n", c);

    // (d)
    printf("(d-before) prime_lt_100[6] = %d\n", prime_lt_100[6]);
    prime_lt_100[6] = prime_lt_100[6] + prime_lt_100[16];
    printf("(d-after) prime_lt_100[6] = %d\n", prime_lt_100[6]);

    return 0;
}


/*
(a) prime_lt_100[24] = 97
(b) prime_lt_100[i+4] = 47
(c) prime_lt_100[prime_lt_100[2] + prime_lt_100[0]] = 19
(d-before) prime_lt_100[6] = 17
(d-after) prime_lt_100[6] = 76
*/