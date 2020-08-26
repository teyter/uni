#include <stdio.h>
#include <string.h>

int my_strlen(char s[]) {
    int i = 0;
    int lengd = 0;
        while (s[i] != '\0') { 
            i++;
            lengd++;
        } return lengd;
}

int main() {
    char a[] = "heimadaemi";
    int my_str = my_strlen(a);
    int str = strlen(a);
    printf("my_str = %d\n", my_str);
    printf("str = %d\n", str);
}
