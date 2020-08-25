import time

def isPrime(N):
    for i in range(3,N-1,2):
        if N % i == 0: 
            return False
    return True

N = 60085
#N = 6008514 # 0.21s
#N = 60085147 #1.9s
#N = 600851475 # 19.79s
#N = 6008514751 # 338s
start = time.time()
for i in range(int(N/2), 2, -1):
    if N % i == 0 and isPrime(i):
        print('Prime factor:', i)
        break
end = time.time()
print('Time:', end-start)
