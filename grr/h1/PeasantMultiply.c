#include <stdio.h>
#include <stdlib.h>

int pes(int x, int y) {
    int prod = 0;
    while (x > 0) {
        if (x % 2 != 0) prod = prod + y;
        x = x / 2;
        y = y + y;
    }
    return prod;
}
int rec(int x, int y) {
    int prod = 0;
    while (x > 0) {
        if (x % 2 != 0) 
            prod = prod + y;
        x = x / 2;
        y = y + y;
    }
    return prod;
}

int main(int argc, char **argv) {
    int x = 7;
    int y = x / 2;
    printf("%d\n", pes(5,5));
}
