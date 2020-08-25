import math

def circle(r):
    """skilar flatarmáli hrings með F=r^2*pi"""
    F = (r**2)*math.pi
    return F

def triangle(g,h):
    """skilar flatarmáli þríhyrnings með gh/2"""
    F = (g*h)/2
    return F
def square(a,b):
    """skilar flatarmáli rétthyrnings með ab"""
    F = a*b
    return F

#print(f'Flatarmal hringsins er {circle(1):.2f}')
#print(f'Flatarmal þríhyrningsins er {triangle(5,7):.2f}')
#print(f'Flatarmal rétthyrnings er {square(5,5):.2f}')
#help(circle)
#help(triangle)
#help(square)
