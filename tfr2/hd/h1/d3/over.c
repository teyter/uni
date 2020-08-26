#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main( void )
{
   int i  = 0;
   int a[11];

   int min = 0;
   int max = 0;

   srandom( (unsigned) time(NULL) );
   a[0]=random( ) % 100 ;
   min = a[0];

for (i=1;i<11;i++)
     {
       a[i]=random( ) % 100 ;


       printf("%d\n", a[i]);

       if (a[i] > max)
            {
          max = a[i];
            }
       if (a[i] < min)
            {
          min = a[i];
            }
    }
            printf("Min: %d\n", min);
            printf("Max: %d\n", max);

return 0;
}