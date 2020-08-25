x = float(input("Verd: "))
y = input("Skattthrep: ")
if (y == 'H' or y == 'h'):
    print(x*1.24)
elif (y == 'L' or y == 'l'):
    print(x*1.11)
else:
    print("Vinsamlega sladu inn H eda L")
