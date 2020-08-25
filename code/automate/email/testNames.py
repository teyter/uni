import numpy as np

nafn, email = np.genfromtxt('names.txt',dtype='str').T
lengd = len(nafn)

for i in range(lengd):
    print('Godan daginn', nafn[i], 'er netfang', email[i])
