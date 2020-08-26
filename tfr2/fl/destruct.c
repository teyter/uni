#include <stdio.h>

struct complex {
    double re;
    double im;
};

struct complex complex_plus(struct complex a, struct complex b) {
    struct complex c;
    c.re = a.re + b.re;
    c.im = a.im + b.im;
    return c;
}

void print_complex(struct complex a) {
    if (a.im == 0)
        printf("%f", a.re);
    else if (a.re == 0)
        printf("%fi", a.im);
    else 
        printf("%f + %fi", a.re, a.im);
}

int main() {
    struct complex a,b;
    a.re = 5.0;
    a.im = 6.0;
    b.re = -3.0;
    b.im = 4.0;

    print_complex(a);
    printf("\n");
    print_complex(b);
    printf("\n");
    struct complex c = complex_plus(a,b);
    print_complex(c);
    printf("\n");
}
