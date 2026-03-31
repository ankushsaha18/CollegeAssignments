#include <iostream>
using namespace std;

enum hello
{
    a,
    b = 99,
    c,
    d = -1
};
int main()
{
    enum hello m;
    cout << a << " " << b << " " << c << " " << d << endl;
    return 0;
}


// Output: 0 99 100 -1