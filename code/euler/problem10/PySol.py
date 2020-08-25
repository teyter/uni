import time

def f(x):
    if x == 0 or x == 1: return False
    for i in range(2,x):
        if x % i == 0:
            return False
    return True

prime = []
for i in range(200000):
    if f(i): prime.append(i)

start = time.time()
print( sum(prime) )
end = time.time()
print('Time', end-start)
