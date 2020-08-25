import numpy as np

A = np.random.randint(10,size=(100,200))

print(A)
B = A != 0
print('Sparsity pattern: ')
print(A[B])

print( A.size )
print( B.size )
