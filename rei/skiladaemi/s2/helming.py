import math
import random
import numpy

def leita(x,a):
    """Fallhaus til að einfalda notkun"""
    def leitaij(i,j):
        m = math.floor((i+j)/2)
        #print(m)
        if j <= i: return -1
        elif x < a[m]: return leitaij(i,m)
        elif x > a[m]: return leitaij(m+1,j)
        else: return m
    n = len(a)
    stads = leitaij(0,n)
    return stads

s = "abcdefghijklmnopqrstuvxyz"
l = range(0,1000000)

# fyrir nedan helmingunarlinu
print(leita(338349,l))

# fyrir ofan helmingunarlinu
print(leita(788987,l))

# strax rett
print(leita(500000,l))
print("Saeti stafs: " + str(leita("t",s)))

# random
x = numpy.random.randint(1000000,size=1000000)
x.sort()
y = random.randint(0,1000000)
print("random: ")
print("random: " + str(leita(y,x)))
#help(leita)
