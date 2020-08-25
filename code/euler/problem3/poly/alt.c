#include <stdio.h>

int isPrime(long long int N) {
    for (long long int i = 2; i < N-1; i++) {
        if (N % i == 0) return 0;
    } return 1;
}
// 600851475143
int main() {
    //unsigned long int N = 60085147; /* 0.22s */
    unsigned long int N = 600851475U; /* 1.96s */
    //unsigned long long int N = 6008514751U; /* 19.46s */
    //long long int N = 60085147514;
    //unsigned long int N = 600851475143;
    long long int i;
    for (i = N/2; i > 0; i--) {
        if (N % i == 0 && isPrime(i) == 1) {
            printf("Prime factor: %lli\n", i);
            break;
        }
    }
}
