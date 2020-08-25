from math import sqrt

def batman(a,b,c): # fall sem leysir annars stigs jöfnu
    if (b**2) - (4*a*c) < 0 or a == 0: # ef mínus er undir rót eða núll í nefnara
        print("There is no solution")
    else:
        x = (-b+sqrt((b**2)-(4*a*c)))/(2*a) # ef plús kemur á eftir b
        y = (-b-sqrt((b**2)-(4*a*c)))/(2*a) # ef mínus kemur á eftir b
        if x == y: # ef x er jafnt y þá er bara ein lausn
            print("There is one solution: " + str(x))
        else: # annars eru tveir lausnir
            print("There are two solutions: " + str(x) + " and " + str(y))

batman(-7,2,9)
batman(2,4,2)
batman(3,-18,37)
batman(0,7,15) # beðið var um að prófa fyrsta stigs jöfnu 
# ég skildi það þannig að þá er a = 0 en þá 
# fáum við auðvitað 0 í nefnara
