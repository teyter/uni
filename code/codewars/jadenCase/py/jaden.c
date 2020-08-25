#include <stdio.h> 
#include <string.h> 
#include <ctype.h> 

char* jaden(char str[]) {
    char space = ' ';
    int len = strlen(str);
    str[0] = toupper( str[0] );
    for (int i = 0; i < len; i++) {
        if (str[i-1] == space)
            str[i] = toupper( str[i] );
    }
    char* ptr = &str[0];
    return ptr;
}
int main() {
    char s[] = "if mirrors aren't real then how can";
    char* k = jaden(s);
    int len = strlen(s);
    printf("result: %s\n", k);
}
