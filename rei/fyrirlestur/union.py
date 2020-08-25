A = {2,4,6,8,10,12,14,16,18,20}
B = {3,6,9,12,15,18}
C = {2,3,5,7,11,13,17,19}
D = A.intersection(B)
M = C.union(D)

print(D)
print(M)
for i in M:
     print(i**2)
