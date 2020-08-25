import numpy as np

z = np.array([2, 1])
x = np.array([2.1, 0.9])
zd = np.array([2, 4])

oskar = (zd @ x) + (1 - (zd @ z))
print(f'{oskar:.1f}')
