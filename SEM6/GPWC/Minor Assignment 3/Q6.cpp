#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
    srand(time(0));
    int arr[10], shifted[10];

    // Generate random array
    for (int i = 0; i < 10; i++)
        arr[i] = rand() % 100;

    // Shift right by 2
    for (int i = 9; i >= 2; i--)
        shifted[i] = arr[i - 2];

    // Fill first 2 positions with random values in [20, 30]
    shifted[0] = 20 + rand() % 11;
    shifted[1] = 20 + rand() % 11;

    cout << "Original: ";
    for (int i = 0; i < 10; i++) cout << arr[i] << " ";
    cout << endl;

    cout << "Shifted:  ";
    for (int i = 0; i < 10; i++) cout << shifted[i] << " ";
    cout << endl;

    return 0;
}


// Original: 61 68 76 49 57 22 54 69 31 76 
// Shifted:  27 30 61 68 76 49 57 22 54 69 