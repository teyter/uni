import numpy as np

x = np.array([2,3,7,1])
for i in range(1000000):
    y = np.random.randint(0,99,4)
    if x@y == 0:
        print(y)
