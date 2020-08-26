#include <stdio.h>

int isPrime(int N) {
    int k = 0;
    for (int i = 2; i < N-1; i++) {
        if (N % i == 0) {
            k = i; 
            return k;
        }
    } return 1;
}

int main() {
    int n; 
    scanf("%d", &n);
    int x = isPrime(n);
    if (x == 1) printf("%d is prime\n", n);
    else printf("%d is smallest prime factor\n", x);
}
