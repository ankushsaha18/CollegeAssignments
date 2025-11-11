#include <stdio.h>

void arrange(int *x, int *y) {
    if (*y < *x) {
        int temp = *x;
        *x = *y;
        *y = temp;
    }
}

int main() {
    int n1, n2, n3, n4, n5, n6;

    printf("Enter SIX numbers separated by blanks> ");
    scanf("%d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6);

    // total calls = (N-1)x(N-1)

    for(int i = 0 ; i < 5 ; i++){
        arrange(&n1, &n2);
        arrange(&n2, &n3);
        arrange(&n3, &n4);
        arrange(&n4, &n5);
        arrange(&n5, &n6);
    }

    printf("The numbers in ascending order are: %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6);

    return 0;
}


/*
Enter SIX numbers separated by blanks> 10 7 5 4 2 1
The numbers in ascending order are: 1 2 4 5 7 10
*/

/*
main stack frame

n1 : 10       
n2 : 7         
n3 : 5
n4 : 4
n5 : 2
n6 : 1

arrange(&n1, &n2)

------------------------------------

arrange stack frame

x → &n1
y → &n2

Before swap:
   *x = 10
   *y = 7

After swap:
   *x = 7
   *y = 10

*/