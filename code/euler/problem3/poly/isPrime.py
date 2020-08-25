import math

def isPrime(N):
    for i in range(2, math.ceil(N/2)):
        if N % i == 0: 
            return False
    return True

#N = 600851475143
N = 2000000

for i in range(2,N):
    if N % i == 0 and isPrime(i):
        print(i)

