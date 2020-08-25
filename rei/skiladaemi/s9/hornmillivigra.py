import numpy as np
import numpy.linalg as la

x = np.array([4,4,7])
y = np.array([6,7,13])

print("x = ", x)
print("y =", y)
print("xTy =", x.dot(y) )
xTy = x.dot(y)
xnorm = la.norm(x)
ynorm = la.norm(y)
xNy = xnorm*ynorm
rad = np.arccos(xTy/xNy)
horn = np.degrees(rad)
print(f'Horn: {horn:.2f}°')
