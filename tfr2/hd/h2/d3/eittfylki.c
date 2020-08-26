#include <stdio.h>
#include <stdlib.h>

double* array_init(int n) {
    //double* fylki = (double*)calloc(n, sizeof(double));
    double* fylki;
    fylki[0] = 0.0;
    double* pa;
    pa = &fylki[0];
    for (int i = 0; i < n; i++) {
        fylki[i] = pa;
        printf("%f\t", fylki[i]);
        } 
    return fylki;
}

int main(int argc, char* argv[]) {
    int n = atoi(argv[1]);
    array_init(n);
}
