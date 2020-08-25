import numpy as np
import matplotlib.pyplot as plt

nba = np.loadtxt("karfa.txt")
a = nba[:,0]
h = nba[:,1]
w = nba[:,2]
ma = np.median(a)
print(f'Midtala aldurs er {ma:.2f}')

 split leidin
asort = a
asort.sort()
syngri = a[:len(asort)//2]
eldri = a[len(asort)//2:]
print(eldri)

# logical indexing leidin
yngri = (a <= ma)
eldri = (a > ma)
me = h[eldri].mean()
my = h[yngri].mean()
print(f'Meðalaldur eldri: {me:.2f}')
print(f'Meðalaldur yngri: {my:.2f}')
