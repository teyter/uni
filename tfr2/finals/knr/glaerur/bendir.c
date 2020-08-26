#include <stdio.h>

int main() {
    int i = 0, j = 9;
    int* p = &i;
    *p = -1;
    //p = &j;
    printf("%d\n", *p == i);
    printf("i = %d, *p = %d\n", i, *p);

    int *z = p;
    z = &j;
    printf("i = %d, *p = %d\n", i, *p);
    double *r = (double*) p;
}
