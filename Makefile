# This is the Makefile for the SLang compiler

ANTLR=./antlr-4.13.0-complete.jar

all: generate

generate:
	java -jar $(ANTLR) -o output GLang.g4

#compile:
#	javac -cp $(ANTLR):output:. Main.java


