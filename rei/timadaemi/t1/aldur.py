import math

jon = int(input("Aldur Jons: "))
pall = int(input("Aldur Pals: "))

if jon > pall:
    print("Jon er eldri en Pall")
    print("Jon er " + str(jon-pall) + " arum eldri")
elif jon < pall:
    print("Pall er eldri en Jon")
    print("Pall er " + str(pall-jon) + " arum eldri")
elif jon == pall:
    print("Their eru jafngamlir")
