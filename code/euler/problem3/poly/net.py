import time

def isPrime( value ):
  for i in range( 2, value ):
    if value % i == 0:
      return False
  return True

def LargestPrimeFactor ( value ):
  result = []
  for i in range( 2, value ):
    if isPrime( i ):
      if value % i == 0:
        result.append( i )
  return result

start = time.time()
#print( LargestPrimeFactor( 600851475143 ) ) 
print( LargestPrimeFactor( 60085 ) ) 
end = time.time()
print('Time:',end-start)
