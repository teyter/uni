#EINK
eink = [4.0, 7.0, 10.0, 7.0, 9.0, 7.0, 6.0, 7.0, 9.0, 6.0]
index = 0
topStudent = max(eink)
indexOfTS = 0
print("Nr.\tEink\tAth")
for x in eink:
    index += 1
    if x >= 9.0:
        print(f'{index}\t{x}\tÁg')
    elif x < 5.0:
        print(f'{index}\t{x}\tF')
    else:
        print(f'{index}\t{x}')
    if x == topStudent:
        indexOfTS = index

avg = sum(eink) / len(eink)
print("Meðaleinkunn: " + str(avg))
print(f'Nemandi nr. {indexOfTS} er með hæstu einkunn: {topStudent}')

fjoldi = "X"
eink.sort()
for x in range(4, 11, 1):
    fj = fjoldi*eink.count(x)
    print(str(x)+".0"+"\t"+str(fj))
