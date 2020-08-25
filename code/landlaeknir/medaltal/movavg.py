import numpy as np
import statistics as stat

covid_dates = np.loadtxt('dates.txt',dtype=str)
covid_smit = np.loadtxt('smit.txt')

def movavg3(smit):
    ret = np.zeros( len(smit) )
    for i in range( 0,len(smit)-3,1 ):
        arr = [smit[i],smit[i+1],smit[i+2]]
        ret[i+3] = np.mean(arr)
    return ret

test = movavg(covid_smit)

for i in range( len(test) ):
    print( test[i] )
