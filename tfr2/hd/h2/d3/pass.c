#include <stdio.h>
#include <stdlib.h>

void plus_one(int* y) {
    int *ip = (int*)malloc(sizeof(int));
    *ip += 1;
}

int main(int argc, char* argv[]) {
    int x = 1;
    int* y = &x;
    printf("y*= %d\n",*y);
    plus_one(y);
    printf("NOWy*=%d\n", *y);
    printf("x=%d\n", x);
}
