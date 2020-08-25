#BYRJA -- Keyrið til að frumstilla numpy o.fl.
import numpy as np
import numpy.random as npr
import matplotlib.pyplot as plt
plt.rc('axes', axisbelow=True)
#%matplotlib inline
np.set_printoptions(precision=2, floatmode='fixed', suppress=True)
#1
x = np.array([1,2,3])
y = np.array([4,5,6])
print(f'Fylki x: {x}')
print(f'Fylki y: {y}')
# 2
print("2*x: " + str(np.dot(2,x)))
print("x+y: " + str(x+y))
print("x*y: " + str(x.dot(y)))
# 3
z = y[1:] # hlutvigurinn y2,y3
print(z)
# 4
sv = npr.randint(9,size=(3,6))
print(sv)
print("Meðalta stakanna: " + str(sv.sum()/sv.size))
print("Miðtala: " + str(np.median(sv)))
print("Minnsta stakið " + str(sv.min()) + " er á stað " + str(sv.argmin()+1))
# 5
A = np.array([[2,1,0],[4,4,4],[0,1,2]])
x = A[:1]
print("x: " + str(x))
y = A[1:2]
print("y: " + str(y))
z = A[2:3]
print("z: " + str(z))
u,v,w = A
print("u: " + str(u))
print("v: " + str(v))
print("w: " + str(w))
# 6
p = A[0:3,0]
print("Fyrsti dalkur: " + str(p))
q = A[0:3,1]
print("Midju dalkur: " + str(q))
r = A[0:3,2]
print("Aftasti dalkur: " + str(r))
