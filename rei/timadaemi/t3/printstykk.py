import numpy as np

holm = np.loadtxt("stykk.txt")
print(holm)
np.savetxt("fstykk.txt", holm, delimiter='\t')
fholm = np.loadtxt("fstykk.txt")
#print(fholm)
