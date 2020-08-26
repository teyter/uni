#include <stdio.h>
#include <stdlib.h>

void mymemcpy(char *dst, char *src, size_t len) {
    for (size_t i = 0; i < len; ++i)
        dst[i] = src[i];
}

char **split(char *s, int *n) {
    //*n = 0;
    //char **strs = NULL;

    int i = 0, previdx = 0;
    while (1) {
	if (s[i] == ' ' || s[i] == '\t' || s[i] == '\0') {
	    //*n += 1;
	    //strs = realloc(strs, *n * sizeof(*strs));
	    size_t len = i - previdx;
	    char *str = malloc(len + 1);
	    mymemcpy(str, s + previdx, len);
	    str[len] = '\0';
	    strs[*n - 1] = str;
	    previdx = i + 1;
    }
    if (s[i] == '\0')
        break;
	i += 1;
    }

    return strs;
}

int main() {
    char *foo = "oskar\telskar leeds\t sygir  lok";
    int strs_len;
    char **strs = split(foo, &strs_len);
    for (int i = 0; i < strs_len; ++i) {
        printf("String %i: %s\n", i, strs[i]);
    }

    // Free memory
    for (int i = 0; i < strs_len; ++i) free(strs[i]);
    free(strs);
    return 0;
}
