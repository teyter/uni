#include <stdio.h>
#include <stdlib.h>

typedef struct matrix {
    double* a;
    int n;
    int m;
} matrix;

matrix mult(matrix A, matrix B) {
    matrix C;
    C.a = malloc(sizeof(double)*A.m*B.m);
    C.n = A.n;
    C.m = B.n;
    // triple for loop for radirA.n dalkarB.m stakC.n
    for (int i = 0; i < A.n; i++) {
        for (int j = 0; j < B.m; j++) {
            for (int k = 0; k < A.m; k++) {
                C.a[i*C.m+j] += A.a[i*A.m+k]*B.a[k*C.m+j];
            }
        }
    }
    return C;
}

int main(int argc, char* argv[]) {
    matrix A;
    A.n;
    A.m;
    printf("Línur og dálkar fyrir fylki 1: ");
    scanf("%d %d", &A.n, &A.m);
    matrix B; 
    B.n;
    B.m;
    printf("Línur og dálkar fyrir fylki 2: ");
    scanf("%d %d", &B.n, &B.m);
    A.a = malloc(sizeof(double)*A.m*A.n);
    B.a = malloc(sizeof(double)*B.m*B.n);
    int stak1; int stak2;
    int stak3; int stak4;
    int stak5; int stak6;
    int stak7; int stak8;
    printf("Stök í fylki 1: ");
    scanf("%d %d %d %d",&stak1,&stak2,&stak3,&stak4);
    printf("Stök í fylki 2: ");
    scanf("%d %d %d %d",&stak5,&stak6,&stak7,&stak8);
    for (int i = 0; i < A.m; i++) {
        for (int j = 0; j < A.m; j++) {
            A.a[i*A.m+j] = stak1;
            B.a[i*B.m+j] = stak2;
        }
    }
    matrix D = mult(A,B);
    for (int i = 0; i < A.m*B.m; i++) {
        printf("[%.1f] ", D.a[i]);
    } printf("\n");
}
