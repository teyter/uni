#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* str_plus(char* a, char *b) {
    int na = strlen(a);
    int nb = strlen(b);
    int n = na+nb;
    char *s = (char*) malloc(n+1);
    for (int i = 0; i < na; i++) {
        s[i] = a[i];
    }
    for (int i = 0; i < nb; i++) {
        s[i+na] = b[i];
    }
    s[n] = '\0';
    return s;
}

int main() {
    char* a = "oskar";
    char* b = "faggi";
    char* res = str_plus(a,b);
    printf("%s\n", res);
}
