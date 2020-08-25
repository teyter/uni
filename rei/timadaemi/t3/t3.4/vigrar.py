import numpy as np

v = np.array([[1,2,3],[4,5,6]])
#print("Summa vigurs: " + str(v.sum()))
#print("Max vigurs: " + str(v.max()))
#print("Min vigurs: " + str(v.min()))
#print("Mean vigurs: " + str(v.mean()))
bla = v.argmax()-1
print("ArgMax vigurs: " + str(v.argmax()))
print("dd" + str(v[1][1]))
print("ArgMin vigurs: " + str(v.argmin()))
