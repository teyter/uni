import math

def cos(a,b,C):
    c = math.sqrt(a**2 + b**2 - 2*a*b*math.cos(math.radians(C)))
    print(f'c = {c:.2f}')
    A = math.degrees(math.asin((math.sin(math.radians(C))*a)/c))
    print(f'A = {A:.2f}')
    B = 180 - A - C
    print(f'B = {B:.2f}')

a = float(input("a: "))
b = float(input("b: "))
C = float(input("C: "))
cos(a,b,C)
