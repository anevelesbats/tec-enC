
CC=gcc
CFLAGS=-std=c99 -W -Wall -I tec

all: simple

clean:
	rm -f *.o

cleanup: clean
	rm -f simple

simple: simple.o autobus.o ps_standard.o 
	${CC} simple.o autobus.o ps_standard.o -o $@ 

simple.o: simple.c tec/autobus.h tec/ps_standard.h
	${CC} ${CFLAGS} simple.c -c

autobus.o: tec/autobus.c tec/autobus.h tec/__internes.h
	${CC} ${CFLAGS} tec/autobus.c -c

ps_standard.o: tec/ps_standard.c tec/ps_standard.h tec/__internes.h
	${CC} ${CFLAGS} tec/ps_standard.c -c 

