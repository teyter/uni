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
    C.m = B.n;
    // triple for loop for radirA.n dalkarB.m stakC.n
    for (int i = 0; i < A.n; i++) {
        for (int j = 0; j < B.m; j++) {
            for (int k = 0; k < A.m; k++) {
                C.a[j*C.m+i] += A.a[i*A.m+k]*B.a[k*C.m+j];
            } printf("%.2f ", C.a[j*C.m+i]);
        } printf("\n");
    }
    return C;
}

int main() {
    matrix A;
    A.n = 2;
    A.m = 3;
    matrix B; 
    B.n = 3;
    B.m = 1;
    A.a = malloc(sizeof(double)*A.m*A.n);
    B.a = malloc(sizeof(double)*B.m*B.n);
    for (int i = 0; i < A.n; i++) {
        for (int j = 0; j < B.m; j++) {
            A.a[i*A.m+j] = 7;
            B.a[i*B.m+j] = 5;    
        }
    }
    mult(A,B);
}
