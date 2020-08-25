import numpy as np

x = np.random.randint(0,100,10)
print(x)
def finnaMax(x):
    max = x[0]
    for i in x:
        if i > max:
            max = i
    print('Max: ', max)

finnaMax(x)
