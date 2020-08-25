import numpy as np
import numpy.linalg as la

x = np.array([1,3,3,9])
e = np.array([1,1,1,1])

stdx = np.std(x)

print( stdx )
print( np.std(2*x + e) )

a = 1/stdx
avgx = sum(x)/len(x)
b = (x - avgx)
print(a * b)
print(5/3)
