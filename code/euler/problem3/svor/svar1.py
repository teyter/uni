import time

n = 600851475143
factor = 3
lastFactor = 1
start = time.time()

while n > 1:
    if n % factor == 0:
        lastFactor = factor
        n /= factor
        while n % factor == 0:
            n /= factor
    factor += 2

end = time.time()
print(end-start)
print(lastFactor)
