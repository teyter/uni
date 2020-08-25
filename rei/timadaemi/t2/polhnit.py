# Breytt milli pólhnita og rétthyrndra hnita
#
# x,y = pol2rec(r,theta) skilar réttyrndum hnitum (x,y) fyrir pólhnitin (r,theta)
# r,theta = rec2pol(x,y) skilar pólhnitun (r,theta) fyrir rétthyrndu hnitin (x,y)

from math import sin, cos, sqrt, atan2

def pol2rec(r,theta):
    x = r*sin(theta)
    y = r*cos(theta)
    return x,y
                
def rec2pol(x,y):
    r = sqrt(x**2 + y**2)
    theta = atan2(y,x)
    return r,theta
