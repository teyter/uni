#include <stdlib.h>
#include <stdio.h>
#include<string.h>
double** array_init(int n, int m) {
    double** arr = (double**)malloc(sizeof(double*)*n);
        for (int i=0; i<n; i++) {
	    arr[i] = malloc(sizeof(double)*m);
	}
	for (int i=0; i<n; i++) {
	    for (int j=0; j<m; j++) {
	        arr[i][j] = 0.0;
	    }
	}
    return arr;
}
void array_free(double** arr, int n) {
    for (int i=0; i<n; i++) {
        free(arr[i]);
    }
    free(arr);
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
