import numpy as np

A = np.array([1,2,3],
             [0,1,2],
             [0,2,1])
print( A.base is None )
