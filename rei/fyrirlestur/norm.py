import numpy as np
import numpy.linalg as la

x = np.array([4,4,7])
y = np.array([6,7,13])

normx = la.norm(x)
normy = la.norm(y)

print( normx )
print( normy )
print( normx-normy )
print( la.norm(x-y) )

teljari = x @ y
nefnari = normx*normy
theta = np.arccos(teljari/nefnari)
degree = np.degrees(theta)

print( degree )
