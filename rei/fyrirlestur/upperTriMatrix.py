import numpy as np

n = int(input('Matrix sixe: ' ))

A = np.zeros((n,n))
for i in range(n):
    for j in range(n):
        if i == 0 and j == 0:
            A[i][j] = 1
        else:
            A[i][j] = int(1/(i + j))

A = np.array([5,4,2,1,2])
print(np.var(A))
