import numpy as np
import numpy.random as npr

npr.seed(10)
def slembixy(n):
    x = 1 + 5*npr.random(n)
    e = 0.7*npr.normal(size=n)
    y = 1.5*x + 0.3 + e
    return x, y
