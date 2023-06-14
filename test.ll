@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%a = alloca i32
store i32 4, i32* %a
%b = alloca i32
store i32 2, i32* %b
%1 = sub i32 10, 2
%d = alloca i32
store i32 %1, i32* %d
%2 = load i32, i32* %d
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
%4 = load i32, i32* %a
%5 = load i32, i32* %b
%6 = call i32 @test(i32 %4, i32 %5)
%c = alloca i32
store i32 %6, i32* %c
%7 = load i32, i32* %c
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
br label %target8
target8:
%9 = load i32, i32* %a
%10 = icmp slt i32 %9, 10
br i1 %10, label %true10, label %false10
true10:
%11 = load i32, i32* %a
%12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %11)
%13 = load i32, i32* %a
%14 = add i32 1, %13
store i32 %14, i32* %a
br label %target8
false10:
ret i32 0 }

define i32 @test(i32 %0, i32 %1) { 
%a = alloca i32
%b = alloca i32
store i32 %0, i32* %a
store i32 %1, i32* %b
%3 = load i32, i32* %a
%4 = load i32, i32* %b
%5 = add i32 %4, %3
%c = alloca i32
store i32 %5, i32* %c
%d = alloca i32
%6 = load i32, i32* %c
%7 = icmp sgt i32 %6, 10
br i1 %7, label %true7, label %false7
true7:
store i32 5000, i32* %d
br label %extra7
false7:
store i32 1000, i32* %d
br label %extra7
extra7:
%8 = load i32, i32* %d
ret i32 %8
}


