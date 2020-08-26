#include <stdio.h>

int double_it(int x) {
    x = 2 * x;
    return x;
}
int main(int argc, char* argv[]) {
    int i = 10;
    int j = double_it(i);
    printf("i = %d, j = %d\n", i, j);
}
