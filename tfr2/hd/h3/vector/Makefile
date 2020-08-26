CC=gcc

vector.o: vector.c vector.h
	$(CC) -c -o vector.o vector.c

vector_main: vector.o vector_main.c
	$(CC) -o vector_main vector_main.c vector.o

clean:
	rm -f main vector_main *.o
