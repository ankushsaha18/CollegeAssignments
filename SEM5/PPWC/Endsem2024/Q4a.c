#include<stdio.h>
#include<string.h>
struct student{
    char name[50];
    int age;
    float marks;
};
int main(){
    struct student s;
    struct student *ptr = &s;
    strcpy(ptr->name,"John Doe");
    ptr ->age = 20;
    ptr ->marks = 85.5;
    printf("Name: %s\n", ptr->name);
    printf("Age: %d\n", ptr->age);
    printf("Marks: %.2f\n", ptr->marks);
    return 0;
    
}