# this program assumes that the largest prime factor
# cannot be larger that sqrt(n) which is true in the 
# case of the requested number but not for all numbers
# for example n = 14
import math

factors = []
n = 600851475143

for i in range(2, math.ceil(math.sqrt(n))):
    while n % i == 0:
        factors.append(i)
        n = n / i
print(factors[-1])
