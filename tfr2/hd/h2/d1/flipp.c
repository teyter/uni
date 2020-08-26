#include <stdio.h>

int main() {
    int x = 0;
    int* ip = &x;

    printf("x=%d\nip=%p\n&x=%d\n*ip=%d\n",x,ip,&x,*ip);

    *ip += 1;
    printf("x=%d\nip=%p\n&x=%d\n*ip=%d\n",x,ip,&x,*ip);

    float *fp = (float*)ip;
    printf("x=%d\nip=%p\n&x=%d\n*ip=%d\n",x,ip,&x,*ip);
    printf("*fp=%f\n", *fp);
    printf(">fp=%p\n", fp);
    
    *fp = 1.0;
    printf("x=%d\nip=%p\n&x=%d\n*ip=%d\n",x,ip,&x,*ip);
    printf("*fp=%f\n", *fp);
    printf(">fp=%p\n", fp);

    int y = *ip;
    printf("x=%d\nip=%p\n&x=%d\n*ip=%d\n",x,ip,&x,*ip);
    printf("*fp=%f\ny=%d\n", *fp,y);
    printf(">fp=%p\n", fp);
}
