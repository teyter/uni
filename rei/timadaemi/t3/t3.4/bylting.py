import numpy as np

#BYLTING
A = np.array([[3,2,1], [0,1,0], [2,2,2]])
print(A)

#print("Transpose")
#print(A.T)

print("Fyrsta lina")
fyrstaLina = A[:1]
print(fyrstaLina)

print("Aftasti dalkur")
aftastiDalkur = A[0:3,2]
print(aftastiDalkur)

print("2x2")
A2x2 = A[0:2,0:2]
print(A2x2)
