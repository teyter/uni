#include <stdio.h>

int main() {
    float a[10][10];
    float b[10][10]; 
    float utkoma[10][10];
    int n1, m1, n2, m2;

    // linur og dalkar i a
    printf("Línur og dálkar í fylki a: ");
    scanf("%d %d",&n1, &m1);
    // linur og dalkar i b
    printf("Línur og dálkar í fylki b: ");
    scanf("%d %d",&n2, &m2);

    // Tekur inn stok i fylki a
    printf("Látið inn gildi fyrir A: ");
    for(int i = 0; i < n1; i++) {
        for(int j = 0; j < m1; j++) {
            printf("a[%d][%d]: ",i, j);
            scanf("%f", &a[i][j]);
        }
    }

    // Tekur inn stok i fylki b
    printf("Látið inn gildi B: ");
    for(int i = 0; i < n2; i++) {
        for(int j = 0; j < m2; j++) {
            printf("b[%d][%d]: ",i, j);
            scanf("%f", &b[i][j]);
        }
    }

    // Nullstilli oll stok i utkomufylki
    for(int i = 0; i < n1; i++) {
        for(int j = 0; j < m2; j++) {
            utkoma[i][j] = 0;
        }
    }

    // fylkin margfoldud of sett i utkomufylki
    for(int i = 0; i < n1; i++) {
        for(int j = 0; j < m2; j++) {
            for(int k = 0; k < m1; k++) {
                utkoma[i][j]+=a[i][k]*b[k][j];
            }
        }
    }

    // prenta utkomu
    for(int i = 0; i < n1; i++) {
        for(int j = 0; j < m2; j++) {
            printf("%.1f\t", utkoma[i][j]);
            if(j == m2 - 1) {
                printf("");
            }
        } printf("\n");
    }
}
