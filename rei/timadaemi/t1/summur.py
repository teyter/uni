import math

def l(n):
    for x in range(n):
        if n % 2 == 0:
            y = 1/n + 1/(n+1)
        else:
            y = 1/n - 1/(n+1)
        return y

x = int(input("Tala: "))
print(str(l(x)))
