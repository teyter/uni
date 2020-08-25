import numpy as np

A = np.loadtxt("a.txt")
print(A)

np.savetxt("b.txt", A*2)

np.savetxt("c.txt", A*2, fmt='%.2f')
