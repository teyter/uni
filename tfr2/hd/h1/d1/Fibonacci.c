#include <stdio.h>
int fib(int x, int y) {
    int a = 0; int b = 1;
    for(int i = 0; i <= y; i++) {
        if (a > x && a < y) 
                printf("%d\n", a);
        int sum = a + b;
        a = b;
        b = sum;
    }
}

int main() {
    fib(5, 500);
}
