import numpy as np

n = 5
x = np.zeros((n,n))
print(x)

for i in range(n):
    for j in range(1,i):
        print("*")
