#include <stdio.h>
#include <stdlib.h>

int main() {
    char x[] = "teitur";
    printf("%c\n", x[5]);
 //   int size = sizeof(x) / sizeof(char);
   // printf("size: %d\n", size);
    char t[][15] = {
        "oskar faggot",
        "oskar leeds",
        "oskar faviti",
        "thegidu oskar",
    };
    int size = sizeof(t) / sizeof(char);
    printf("size: %d\n", size);
   /* for (int i = 0; i < size; i++) {
        for(int j = 0; i < size; j++) {
            printf("%s\n", t[i][j]);
        }
    }*/
}
