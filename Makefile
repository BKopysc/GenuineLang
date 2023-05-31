# This is the Makefile for the SLang compiler

ANTLR=./antlr-4.13.0-complete.jar

TEST_FILE = ./simple-files/test.gl
TEST_OUT = test.ll

all: generate compile test clean
#all: clean

generate:
	java -jar $(ANTLR) -o output GLang.g4

compile:
	javac -cp $(ANTLR):output:. Main.java

test:
	java -cp $(ANTLR):output:. Main $(TEST_FILE) > $(TEST_OUT)
	lli test.ll

clean:
	rm -f *.class
	rm -f ./output/*.class


