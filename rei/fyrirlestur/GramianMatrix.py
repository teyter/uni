import numpy as np
import numpy.linalg as la

RVK = np.array([-1046.06, 2589.09, 5725.31])
LON = np.array([0, 3965.41, 4985.21])

print( RVK @ LON )
deg = np.arccos( (RVK @ LON) / (la.norm(RVK)*la.norm(LON)) )
print( deg )
print( np.degrees( deg ) )
print(6370*deg)
