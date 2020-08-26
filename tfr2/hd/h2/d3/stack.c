#include <stdio.h>
#include <stdlib.h>

double** array_init(int n, int m) {
    double** fylki = (double**)malloc(sizeof(double*) * m);
    for (int i = 0; i < n; i++) {
        fylki[i] = malloc(sizeof(double) * m);
    }
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            fylki[i][j] = 0.0;
        }
    }
    return fylki;
}

void array_free(double** fylki, int n) {
    for (int i = 0; i < n; i++)
        free(fylki[i]);
    free(fylki);
}

int main() {
    int n = 5;
    int m = 5; 
    double **arr = array_init(n,m);
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < m; j++) {
            printf("%.1f ", arr[i][j]);
        } printf("\n");
    }
    array_free(arr,n);
}

