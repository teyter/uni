#include <stdio.h>

char** split(const char* s, int *n) {
    int i = 0;
    while (i != '\t') {
        char fylki[i] = i;
        printf("%c", i);
    return fylki;
}

int main() {
    char *s = "oskar\telskar\tleeds"; // fylla inn
    int n = 3;
    char** split_s = split(s, &n);
    // ... restin pls
}
