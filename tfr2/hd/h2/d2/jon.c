#include<stdio.h>
#include<stdlib.h>

char** split(const char* s, int *n){
    int len = 0; // lengd stora
    int fs = 1; // fjoldi litla strengja
    while(s[len] != 0 ) {
        len++; // fa lengd stora
        if(s[len]==' ' || s[len]=='\t'){
	    fs++; // fa lengd lita
        }
    }
    char** a o= (char**)malloc(fs*sizeof(char*));
    int u = 0; // yet another interator
    for(int i = 0; i < fs; i++){
        int l = 0;
        a[i] = (char*)malloc(len*sizeof(char));
        while(s[u] != '\t' || s[u] != ' ') {
            if(s[u] == '\t' || s[u] == ' ') {
                break;
            }
            a[i][l] = s[u];
            u++;
	    l++;
        }
        a[i][l] = '\0';
        u++;
    }
    *n = fs;
    return a;
}

int main() {
    char *s = "Hello how are you doing\tasshole"; // fyllið inn í þetta
    int n;
    char** split_s = split(s, &n);

    for(int e = 0; e < n; e++ ){
	printf("String %i: %s\n", e, split_s[e]);
    }
    free(split_s);
}
