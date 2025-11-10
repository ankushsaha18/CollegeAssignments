#include <stdio.h>
int main(){
    int a[][2][4] = {5, 6, 7, 8, 9, 11, 12, 1};
    printf("%d\n", *(*(*(a + 0) + 1) + 2));
    return 0;
}

// 12

// Explanation:
// The array 'a' is a 3D array with dimensions [1][2][4].
// The initialization list fills the array in row-major order.
// The expression *(*(*(a + 0) + 1) + 2) can be broken down as follows:
// 1. (a + 0) points to the first 2D array.
// 2. *(*(a + 0) + 1) points to the second 1D array within that 2D array.
// 3. *(*(*(a + 0) + 1) + 2) accesses the third element of that 1D array, which is 12.