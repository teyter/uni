#include <stdio.h>
#include <stdlib.h>

char** split(const char* s, int *n) {
    char** arr = malloc(sizeof(char*) * *n);
    int i = 0;
    int j = 0;
    for (int i = 0; i < *n; i++) {
       arr[i] = malloc(sizeof(double) * *n * *n) + (i*(*n)); 
    } 

    /*while(1) {
        if (s[i] == ' ' || s[i] == '\t' || s[i] == '\0') {
*/
}

int main() {
    char *s = "leeds\tk smok";
    int len;
    int i = 0; // index fyrir while-lykkju
    // fá lengdina á strengnum
    while (s[i] != '\0') {
        i++;
        len++;
    } 
    //char** split_s = split(s, &len);
}
