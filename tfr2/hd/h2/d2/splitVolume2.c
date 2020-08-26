#include <stdio.h>
#include <stdlib.h>

char** split(const char* s, int *n);

int main() {
char *s = "Djammið er ekki svo skemmtilegt elsku kallinn minn!"; // fyllið inn í þetta
int n;
char** split_s = split(s, &n);
// restin af forritinu
}
char** split(const char* s, int *n) {

    int i = 0, argc = 1;
    while (1) {
        if (s[i] == ' ' || s[i] == '\t' || s[i] == '\0') {
            argc = argc + 1;
            while (s[i+1] != ' ' || s[i+1] != '\t') {
                i++;
            }
        }
        i++;
    }
    char** argv = (char**)malloc(argc*sizeof(char*));

    int argh = 1, x = 0;
    for (i = 0; i < argc; i++) {
        if (s[x] == ' ' || s[x] == '\t') {
            while (s[x] == ' ' || s[x] == '\t') {
                x++;
            }
        } else {
            int j = 0;
            while (s[x] != ' ' || s[x] != '\t') {
                argv[i][j] == s[x];
                j++;
                x++;
            }
        }
        printf(argv[i]);
    }
    return argv;
}
