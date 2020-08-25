import numpy as np

r = {1,2,3,4,2,3,4,5,6,2,5,3,1,2,6}
R = np.array([[1,2,3],
              [4,2,3],
              [4,5,6],
              [2,5,3],
              [1,2,6]])
s = {2,5,3,2,5,4,4,5,6,1,2,3}
S = np.array([[2,5,3],
              [2,5,4],
              [4,5,6],
              [1,2,3]])
r = set(R.flatten())
s = set(S.flatten())

x = r.intersection(s)
y = s.intersection(r)
print(x.union(y))
