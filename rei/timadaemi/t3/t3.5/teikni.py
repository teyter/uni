#TEIKNIDÆMI
import matplotlib.pyplot as plt
import numpy as np
x = np.linspace(0,5,6)
y = np.sqrt(x)
plt.figure(figsize=(10,5))
plt.scatter(x,y)
plt.plot(x,y)
plt.grid()
# fl
import numpy as np

pi = np.pi
t = np.linspace(0, 4*pi)
plt.plot(t, np.sin(t))
plt.show()
