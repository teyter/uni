def next(x):
    if x % 2 == 0:
        f = x//2
    else:
        f = 3*x+1
    return f

n = int(input())
print('Collatz-runa:')
while n > 1:
    print(n, end=', ')
    n = next(n)
print(n)
