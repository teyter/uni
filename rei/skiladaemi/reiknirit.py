def litur2:
    fjoldi = [0, 0, 0, 0]
    heildarGildi = 0
    litirTvisvar = false
    while (!litirTvisvar):
        litur = npr.randint(1,5)
        gildi = npr.randint(2,15)
        smatt[litur-1] += 1
        heildarGildi += gildi

        k = 0
        for i in range(0,4):
            if (fjoldi[i] >= 2):
                k += 1
            if (k == 4):
                litirTvisvar = true
    return heildarGildi
        
