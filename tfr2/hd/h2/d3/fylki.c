#include <stdio.h>
#include <stdlib.h>

double** array_init(int n, int m) {
    double* gogn = malloc(sizeof(double) * n * m);
    double** fylki = malloc(sizeof(double) * m);
    for (int i=0; i < n; i++) {
        fylki[i] = gogn + (i*n);//malloc(sizeof(double) * n * m) + (i*n);
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; i < m; j++) {
            fylki[i][j] = 0.0;
        }
    } 
    return fylki;
}

int main(int argc, char* argv[]) {
    int n = atoi(argv[1]);
    int m = atoi(argv[2]);
    double** fylki = array_init(n,m);
    for (int i = 0; i < n; i++) {
        for(int j = 0; j < m; i++) {
            printf("%f ", fylki[i][j]);
        }
    }
}
