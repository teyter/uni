import numpy as np

stykk = np.loadtxt("stykk.txt")
#print(a[:,len(a)-1])
ar = stykk[:,0]
h = stykk[:,1]
minHeat = h.min()
print("Lægsti ársmeðalhiti: " + str(minHeat))
maxHeat = h.max()
print("Hæsti ársmeðtalhiti: " + str(maxHeat))
hottestYear = h.argmax()
print("Árið " + str(int(stykk[hottestYear][0])) + " var heitast.")
coldestYear = h.argmin()
print("Árið " + str(int(stykk[coldestYear][0])) + " var kaltast.")
medalHiti = h.mean()
print(f'Meðtalhiti allra ára: {medalHiti:.2f}')
#print(f'Meðtalhiti 1830-1925: {medalHiti:.2f}')
#print(f'Meðtalhiti 1830-2000: {medalHiti:.2f}')
#print(f'Meðtalhiti 2001-2018: {medalHiti:.2f}')
