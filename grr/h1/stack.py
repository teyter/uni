def mult(x, y, prod = 0):
    if y % 2 != 0:
        prod = prod + x
        x = x+x
        y = y // 2
    if y % 2 == 0:
        x = x+x
        y = y // 2
    if y != 0:
        return mult(x, y, prod)
    return prod

print( mult(6,7) ) 
