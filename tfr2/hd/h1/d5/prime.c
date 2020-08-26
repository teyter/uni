#include <stdio.h>

int isPrime(int N) {
    for (int i = 2; i < N-1; i++) {
        if (N % i == 0) return 0;
    } return 1;
}

int main() {
    int n; 
    scanf("%d", &n);
    int x = isPrime(n);
    if (x == 1) printf("%d is prime\n", n);
    else printf("%d is NOT prime\n", n);
}
