#include <stdio.h>

int main() {

    int x = 0;
    printf("x = %d\n", x);
    int* ip = &x;
    printf("ip = %d\n", ip);
    *ip += 1;
    printf("x = %d\n", x);
    printf("ip = %d\n", ip);
    float *fp = (float*)ip;
    printf("x = %d\n", x);
    printf("ip = %d\n", ip);
    printf("fp = %f\n", fp);
    *fp = 1.0;
    printf("\n");
    printf("x = %d\n", x);
    printf("ip = %d\n", ip);
    printf("fp = %f\n", fp);
    printf("*fp = %f\n", *fp);
    int y = *ip;
    printf("x = %d\n", x);
    printf("ip = %d\n", ip);
    printf("fp = %f\n", fp);
    printf("*fp = %f\n", *fp);
    printf("y  = %d\n", y);



}
