import math
import numpy as np

N = 120
scalar = 0
sqrtN = math.ceil( math.sqrt(N) )
A = np.ones(N, dtype=bool)
B = np.arange(0,N,1)
A[1] = False
j = 0
for i in range( 2, sqrtN ):
    if A[i]:
        while j < N:
            A[j] = False
            j = i**2+(scalar*i)
            scalar += 1
        #for j in range( (i**2+(scalar*i)) , N-1):
        #    A[j] = False
        #    scalar += 1
print(B[A])
