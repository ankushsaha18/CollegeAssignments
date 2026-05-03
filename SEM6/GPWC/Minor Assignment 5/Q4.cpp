#include<iostream>
using namespace std;

int& getMax(int &a, int &b) {
    return (a > b) ? a : b;
}

int main() {
    int x=40, y =60;
    int& maxVal = getMax(x, y);
    cout<<maxVal<<endl;
    maxVal = 30;
    cout <<"x = "<< x<< ", y= " <<y;
    return 0;
}

// 10
// x = 10, y= 30

// 20
// x = 20, y= 30

// 20
// x = 10, y= 30

// 20
// x = 30, y= 10

// 60
// x = 30, y= 40

// 60
// x = 40, y= 30