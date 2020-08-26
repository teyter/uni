#include <stdio.h>

int main() {
    int n = 1;
    int m = 2;
    int *p = &n;
    *p = 5;
    p = &m;
}
