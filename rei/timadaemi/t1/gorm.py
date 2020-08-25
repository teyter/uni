import math
m = float(input('Sláðu inn tölu fyrir m: '))
k1 = float(input('Sláðu inn tölu fyrir k1: '))
k2 = float(input('Sláðu inn tölu fyrir k2: '))
T = 2*math.pi*math.sqrt((m/(k1+k2)))
print(f"Answer: {T:.4}")
