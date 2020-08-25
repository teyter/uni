import time

x = []
i = 1
then = time.time()
while not x:
    if i % 1 == 0  and \
       i % 2 == 0  and \
       i % 3 == 0  and \
       i % 4 == 0  and \
       i % 5 == 0  and \
       i % 6 == 0  and \
       i % 7 == 0  and \
       i % 8 == 0  and \
       i % 9 == 0  and \
       i % 10 == 0 and \
       i % 11 == 0 and \
       i % 12 == 0 and \
       i % 13 == 0 and \
       i % 14 == 0 and \
       i % 15 == 0 and \
       i % 16 == 0 and \
       i % 17 == 0 and \
       i % 18 == 0 and \
       i % 19 == 0 and \
       i % 20 == 0:
        x.append(i)
    i+=1
now = time.time() - then
print( min(x) )
print( f'{now:.2f} seconds' )
