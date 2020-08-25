import numpy as np
import numpy.linalg as la

x = np.array([4,4,7])
y = np.array([6,7,13])

normx = la.norm(x)
normy = la.norm(y)

z = x-y
print(z)
print( la.norm(z) )
print( la.norm(x-y) )
