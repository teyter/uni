#include <stdio.h>

void homo(double x) {
    printf("%.1f\n", x);
}

int main() {
    void (*homo_ptr)(double) = &homo;
    (*homo_ptr)(19.0);
}
