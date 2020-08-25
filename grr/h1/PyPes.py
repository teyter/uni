import math

def pes(x,y):
    prod = 0
    while x > 0:
        if x % 2 != 0:
            prod = prod + y
        x = x // 2
        y = y + y
    return prod

print( pes(6,7) )
