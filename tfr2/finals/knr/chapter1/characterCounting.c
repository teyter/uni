/*
 * 1.5.2 Character Counting
 */
#include <stdio.h>

int main() {
    long nc;

    nc = 0;
    while (getchar() != EOF)
        ++nc;
    printf("%ld\n", nc);
}
