#include <stdio.h>
#include <stdlib.h>

int main(int argc, char* argv[]) {
    int num;
    printf("Enter numer: ");
    scanf("%d", &num);
    num *= num;
    printf("%d\n", num);
}
