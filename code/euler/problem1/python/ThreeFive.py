###########################################################
# Multiples of 3 and 5 
#
# If we list all the natural numbers below 10 that are
# multiples of 3 and 5, we get 3, 5, 6 and 9.
#
# Find the sum of all the multiples of 3 or 5 below 1000.
###########################################################
def isMult(x):
    if i % 3 == 0 or i % 5 == 0:
        return True

summa = 0
for i in range(1000):
    if isMult(i):
        summa += i

print(summa)
