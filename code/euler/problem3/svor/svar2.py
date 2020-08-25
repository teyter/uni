import math
import time

#n = 600851475143
n = 2**100
maxFactor = math.sqrt(n)
factor = 3
lastFactor = 1
start = time.time()

while n > 1 and factor <= maxFactor:
    if n % factor == 0:
        lastFactor = factor
        n /= factor
        while n % factor == 0:
            n /= factor
        maxFactor = math.sqrt(n)
    factor += 2

if n == 1:
    print(lastFactor)
else:
    print(n)

end = time.time()
print('Runtime:', end-start)
