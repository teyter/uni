import math

def gcd(a,b):
    while b != 0:
        c = a % b
        a = b
        b = c
    return a

def lcm(a,b):
    c = (a*b)/gcd(a,b)
    return c

x = float(input("a: "))
y = float(input("b: "))
print("gcd: " + str(gcd(x,y)))
print("lcm: " + str(lcm(x,y)))
