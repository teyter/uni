#include <stdio.h>

int test_and_dec(int* ip) {
    if (*ip >= 0) {
        *ip -= 1;
        return 1;
    } else {
        return 0;
    }
}

int main() {
    int x = 0;
    int* y = &x;
    int result = test_and_dec(&x);
    printf("result: %d\n", result);
}
