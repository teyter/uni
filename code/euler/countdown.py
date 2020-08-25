def g(x):
    print(x)
    if x == 1:
        return 0
    else:
        return g(x-1)

x = int(input('Enter number: '))
print( g(x) ) 
