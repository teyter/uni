import numpy as np
import numpy.linalg as la

x = np.random.randint(0,10,5)
y = np.random.randint(0,10,2)

def knn(x,y):
    nn = x[0]
    for i in range(len(x)):
        if la.norm( y - x[i] ) <= nn:
            nn = x[i]
    return nn


res = knn(x,y)
print( 'KNN: ', res )
