#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

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
  if (a.im == 0) {
    printf("%f",a.re);
  } else if (a.re == 0) {
    printf("%fi", a.im);
  } else {
    printf("%f + %fi", a.re, a.im);
  }
}

void fibo(int x, int y) {
  int a = 0,b=1;
  while (b < y) {
    if (b > x) {
      printf("%d\n",b);
    }
    int t = a+b;
    a = b;
    b = t;
  }
}

int my_strlen(char s[]) {
  int i = 0;
  while(s[i] != '\0') {
    i++;
  }
  return i;
}


struct stat {
  double min;
  double max;
  double avg;
};

struct stat my_stats(double a[], int n) {
  struct stat s;
  double sum = 0.0;
  s.min = s.max = a[0];
  for (int i = 0; i < n; i++) {
    if (a[i] > s.max) {
      s.max = a[i];
    } else if (a[i] < s.min) {
      s.min = a[i];
    }
    sum += a[i];
  }
  s.avg = sum/n;
  return s;
}

double complex_abs(struct complex a) {
  return sqrt(a.re*a.re + a.im*a.im);
}

int main(int argc, char** argv) {
  // 1
  fibo(0,100);

  // 2
  char* s = "Strengur";
  char* t = "";
  printf("%d %d\n", strlen(s), my_strlen(s));
  printf("%d %d\n", strlen(t), my_strlen(t));



  // 3
  double v1[]={0};
  double v2[]={-1,0,10};
  struct stat st1 = my_stats(v1, 1);
  struct stat st2 = my_stats(v2, 3);

  printf("%f %f %f\n", st1.min, st1.max, st1.avg);
  printf("%f %f %f\n", st2.min, st2.max, st2.avg);

  // 4
  struct complex a;
  a.re = 5.0;
  a.im = 6.0;
  printf("%f\n", complex_abs(a));


  // 5
  int N = atoi(argv[1]);
  if (N % 2 == 0) {
    printf("%d is composite, 2 is the smallest prime factor\n",N);
  } else {
    for (int j = 3; j*j <= N; j+= 2) {
      if (N % j == 0) {
        printf("%d is composite, %d is the smallest prime factor\n",N,j);
        return 0;
      }
    }
    printf("%d is a prime number\n",N);
  }


}
