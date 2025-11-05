#include<stdio.h>
int main()
{
char text[100] = "Programming with C can be a challenging creative activity";
printf("%s\n",text);
printf("%18s\n",text);
printf("%.18s\n",text);
printf("%18.7s\n",text);
printf("%-18.7s\n",text);
return 0;
}