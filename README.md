# GenuineLang [GLang]

Homemade language and compilator created from scratch for Computer Science project.

## Language progress:
- variables: int, real ✅
- read, print ✅
- basic arithmetic operations ✅
- pointing out errors during lexical and syntactic analysis ✅
- tests ✅
- if/else ✅
- loop ✅
- functions ✅
- local and global variables ✅

***

## Proof of Concept

### Simple program

```
int a;
read a;

int b;
read b;

int power;
read power;

function int loopIncresase(int a, int b) do
	int c = a;
	while c < b do
		print c;
		c = c + 1;
	end
	return 0;
end

function int loopDecrease(int a, int b) do
	int c = a;
	while c > b do
		print c;
		c = c - 1;
	end
	return 0;
end

function int simplePower(int a, int c) do
	int res = 1;
	int ctr = 1;
	while ctr <= c do
		res = res * a;
		ctr = ctr + 1;
	end
	return res;
end 

if a>b do
	loopDecrease(a,b);
else
	loopIncresase(a,b);
end
	
int pow = simplePower(a,power);

print pow;

```

### Console output
![image](https://github.com/BKopysc/GenuineLang/assets/57834846/013951a5-ecc0-41e1-bb5b-a440e6d7ef22)

## Run yourself
1. You need:
- Java 17
- Linux environment
- Clang and lli tool

2. Create compiler: ```make generate compile```
3. Run .gl file: ```make run-ll INPUT="./poc.gl"```



