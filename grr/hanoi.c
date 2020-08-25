#include <stdio.h>
#include <stdlib.h>

void Hanoi(int n, int src[], int dst[], int tmp[]) {
    if (n > 0) {
        Hanoi(n-1, src, tmp, dst);
        Hanoi(n-1, tmp, dst, src);
    }
}

int main(int argc, char **argv) {
}
