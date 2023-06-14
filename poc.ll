@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%a = alloca i32
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %a)
%b = alloca i32
%2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %b)
%power = alloca i32
%3 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %power)
%4 = load i32, i32* %a
%5 = load i32, i32* %b
%6 = icmp sgt i32 %4, %5
br i1 %6, label %true6, label %false6
true6:
%7 = load i32, i32* %a
%8 = load i32, i32* %b
%9 = call i32 @loopDecrease(i32 %7, i32 %8)
br label %extra6
false6:
%10 = load i32, i32* %a
%11 = load i32, i32* %b
%12 = call i32 @loopIncresase(i32 %10, i32 %11)
br label %extra6
extra6:
%13 = load i32, i32* %a
%14 = load i32, i32* %power
%15 = call i32 @simplePower(i32 %13, i32 %14)
%pow = alloca i32
store i32 %15, i32* %pow
%16 = load i32, i32* %pow
%17 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %16)
ret i32 0 }

define i32 @loopIncresase(i32 %0, i32 %1) { 
%a = alloca i32
%b = alloca i32
store i32 %0, i32* %a
store i32 %1, i32* %b
%3 = load i32, i32* %a
%c = alloca i32
store i32 %3, i32* %c
br label %target3
target3:
%4 = load i32, i32* %c
%5 = load i32, i32* %b
%6 = icmp slt i32 %4, %5
br i1 %6, label %true6, label %false6
true6:
%7 = load i32, i32* %c
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%9 = load i32, i32* %c
%10 = add i32 1, %9
store i32 %10, i32* %c
br label %target3
false6:
ret i32 0
}

define i32 @loopDecrease(i32 %0, i32 %1) { 
%a = alloca i32
%b = alloca i32
store i32 %0, i32* %a
store i32 %1, i32* %b
%3 = load i32, i32* %a
%c = alloca i32
store i32 %3, i32* %c
br label %target3
target3:
%4 = load i32, i32* %c
%5 = load i32, i32* %b
%6 = icmp sgt i32 %4, %5
br i1 %6, label %true6, label %false6
true6:
%7 = load i32, i32* %c
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%9 = load i32, i32* %c
%10 = sub i32 %9, 1
store i32 %10, i32* %c
br label %target3
false6:
ret i32 0
}

define i32 @simplePower(i32 %0, i32 %1) { 
%a = alloca i32
%c = alloca i32
store i32 %0, i32* %a
store i32 %1, i32* %c
%res = alloca i32
store i32 1, i32* %res
%ctr = alloca i32
store i32 1, i32* %ctr
br label %target2
target2:
%3 = load i32, i32* %ctr
%4 = load i32, i32* %c
%5 = icmp sle i32 %3, %4
br i1 %5, label %true5, label %false5
true5:
%6 = load i32, i32* %res
%7 = load i32, i32* %a
%8 = mul i32 %7, %6
store i32 %8, i32* %res
%9 = load i32, i32* %ctr
%10 = add i32 1, %9
store i32 %10, i32* %ctr
br label %target2
false5:
%11 = load i32, i32* %res
ret i32 %11
}


