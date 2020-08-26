/*
 * 1.5.2 Character Counting with double
 */
#include <stdio.h>

int main() {
    double nc;

    for (nc = 0; getchar() != EOF; ++nc);
    printf("%.0f\n", nc/2);
}
