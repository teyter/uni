import numpy as np

x = np.array([[1,2,3],
              [4,5,6]])
print('My genius solution:')
y = x[:, [1,2]]
print(y)
print('Piazza solution: ')
a = np.array([1,2,3])
b = np.array([4,5,6])
z = np.column_stack((a,b))
print(z)
