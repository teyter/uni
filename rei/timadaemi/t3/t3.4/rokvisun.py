import numpy as np

#RÖKVÍSUN
ár = np.arange(2015,2019)
p = np.array([2,3,5,7])
I = [False, True, True, False]
J = ár < 2017
print(p[I])
print(p[ár < 2017])
print(J, ár[J], p[J])
# breytan min
t = p % 2 != 0
#print(t)
