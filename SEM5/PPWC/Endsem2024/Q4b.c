#include <stdio.h>
#include <string.h>
union Data {
    int x;
    float y;

    struct {
        char name[20];
        int age;
    } info;
}d;

int main() {
    strcpy(d.info.name, "Alice");
    d.info.age = 21;
    printf("Name = %s, Age = %d\n", d.info.name, d.info.age);

    d.x = 100;
    printf("x = %d\n", d.x);

    d.y = 3.14f;
    printf("y = %.2f\n", d.y);

    return 0;
}
