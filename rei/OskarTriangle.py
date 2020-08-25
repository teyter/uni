import numpy as np

n = 5
a = np.zeros((n,n))
c = 0
for i in range(n):
    for j in range(n-c):
        a[i][j+c] = 1/(i+j+1)
    c += 1
print(a)
