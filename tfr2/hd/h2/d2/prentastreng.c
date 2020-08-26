#include <stdio.h>
#include <string.h>

int main() {
    char *name = "oskar";
    printf("%s\n", name);
    printf("%p\n", &name);
    for (int i = 0; i < strlen(name); i++) {
        printf("%p\n", name[i]);
    }
}
