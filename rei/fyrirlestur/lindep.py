import numpy as np
import numpy.linalg as la

a = np.array([0,0,1])
x = np.array([2,5,7])

aTx = a@x
print( a*aTx )
