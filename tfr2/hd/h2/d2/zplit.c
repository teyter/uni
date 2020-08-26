#include <stdio.h>

char** split(const char* s, int *n) {
    int strcount = 0;
    char x[*n];
    for (int i = 0; i < *n+1; i++) {
        if (s[i] == '\t' || s[i] == ' ' || s[i] == '\0') {
            //s[i] == '\0';
            printf("\n");
            strcount++;
        } else { 
            printf("%c", s[i]);
            x[i] = s[i];
        }
    } printf("Fjoldi strengja: %d\n", strcount);
    printf("x = %s\n", x);
    return 0;
}

int main() {
    char *s = "oskar\telskar leeds";
    int n;
    int i = 0;
    int mystrlen = 0;
    while (s[i] != '\0') {
        i++;
        mystrlen++;
    } n = mystrlen;
    char** split_s = split(s, &n);
}
