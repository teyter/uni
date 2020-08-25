import math

def newton(a,x):
    counter = 0
    while not abs(x**2-a) < (10**-5)*a:
        counter += 1
        print("Itrun nr: " + str(counter))
        x = (x+(a/x))/2
        print(x) 

a = 150593
x = float(input("Ágiskun á kv.rót hennar: "))
newton(a,x)
