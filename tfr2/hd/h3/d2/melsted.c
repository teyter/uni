#include <stdio.h>
#include <stdlib.h>

typedef struct matrix {
    double* a;
    int n;
    int m;
} matrix;

matrix mult(matrix A, matrix B) {
    matrix C;
    C.a = malloc(sizeof(double)*A.n*B.m);
    C.n = A.n;
    C.m = B.m;
    for (int i = 0; i < A.n; i++) {
        for (int j = 0; j < B.m; j++) {
            for (int k = 0; k < A.m; k++) {
                C.a[j*C.m+i] += A.a[i*A.m+k]*B.a[j*B.n+k];
            } printf("%.1f ", C.a[j*C.m+i]);
        } printf("\n");
    }
    return C;
}

int main() {
     matrix A;
    matrix B;
    matrix C;
    int n, m;
    float a[20];
    scanf("%d %d", &n, &m);
    for (int i = 0; i < (n*m); i++) {
        scanf("%f", &a[i]);
    }
    A.n = n;
    A.m = m;
    A.a = malloc((n*m)*sizeof(double));
    for (int i = 0; i < (n*m); i++) {
        A.a[i] = a[i];
    }

    scanf("%d %d", &n, &m);
    for (int i = 0; i < (n*m); i++) {
        scanf("%f", &a[i]);
    }
    
    B.n = n;
    B.m = m;
    B.a = malloc((n*m)*sizeof(double));
    for (int i = 0; i < (n*m); i++) {
        B.a[i] = a[i];
    }
    
    mult(A, B);
}
