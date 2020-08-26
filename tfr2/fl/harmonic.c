#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]) {

    int n = atoi(argv[1]);

    double sum = 0.0;
    for (int i = 1; i <= n; i++)
        sum += 1.0 / i;

    printf("%f\n",sum);
}
