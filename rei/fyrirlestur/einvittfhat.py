import numpy as np

x0 = 2
x = np.array([1.8, 1.9, 2.0, 2.1, 2.2])
oskar = x - x0
print( oskar )
viktor = 0.5*oskar
print( 0.693+viktor )
print( sum(viktor) )
