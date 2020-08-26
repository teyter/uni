int i = 0, j = 1;
int *p = &i;

*p = -1;
p = &j;
*p == i; // false
&i = &j // virkar ekki

double *r = p; // virkar ekki
double *r = (double*) p;
