#include<stdio.h>
int main()
{
float x=123.456;
printf("%f %.3f %.1f %.0f\n",x,x,x,x);
printf("%e %.5e %.3e %.0e\n",x,x,x,x);
return 0;
}