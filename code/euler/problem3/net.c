#include <stdio.h>

int main(void)
{
  long n = 600851475143;
  long i;

  for (i = 2; i < n; i++)
    while (n % i == 0)
      n /= i;

  printf("%li\n", n);

  return 0;
}
