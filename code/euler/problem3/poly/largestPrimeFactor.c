#include <stdio.h>

int isPrime(long long int N) {
    long long int i;
    for (i = 3; i < N; i+=2) {
        if (N % i == 0) return 0;
    j return 1;
}
// i*i til ad haxa
int main() {
    long long int N = 600851475143;
    long long int i;
    for (i = 3; i < N; i+=2) {
        if (N % i == 0 && isPrime(i) == 1) {
            printf("Prime factor: %lli\n", i);
        }
    }
}
