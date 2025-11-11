#include<stdio.h>
int main() {
    char s[] = {'S','O','A','D','U','\0'};
    int l = 0, r = 0;
    while(s[r] != '\0') {
        r++;
    }
    r--;
    while(l < r) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
    }
    printf("%s\n", s);
    return 0;
}