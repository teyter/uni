#include <stdio.h>

int main() {
    long long int n = 600851475143;
    int factor = 3;
    int lastFactor = 1;

    while (n > 1) {
        if (n % factor == 0) {
            lastFactor = factor;
            n /= factor;
            while (n % factor == 0)
                n /= factor;
        } factor += 2;
    } printf("Largest prime factor: %d\n", lastFactor);
}
