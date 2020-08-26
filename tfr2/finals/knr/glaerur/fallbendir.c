#include <stdio.h>

void f(int* k) {
    *k += 1;
}

int* g(int* k) {
    return k;
}

int main() {
    int x = 1;
    int *p = &x;
    f(p);
    printf("x = %d *p = %d\n", x, *p);
}
