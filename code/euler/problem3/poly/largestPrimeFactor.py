import math

def isPrime(N):
    for i in range(2,N-1):
        if N % i == 0: 
            return False
    return True

N = 6008514
#N = 600851475143
M = math.ceil(math.sqrt(N))

for i in range(2,N):
    if N % i == 0 and isPrime(i):
        print(i)

