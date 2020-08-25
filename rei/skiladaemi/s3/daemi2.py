import numpy as np
import matplotlib.pyplot as plt

stykk = np.loadtxt("stykk.txt")
ar = stykk[:,0]
h = stykk[:,1]
plt.plot(ar,h,marker='o')
plt.show()
