@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%a = alloca i32
store i32 10, i32* %a
br label %target0
target0:
%1 = load i32, i32* %a
%2 = icmp slt i32 %1, 12
br i1 %2, label %true2, label %false2
true2:
%3 = load i32, i32* %a
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%b = alloca i32
store i32 0, i32* %b
br label %target4
target4:
%5 = load i32, i32* %b
%6 = icmp slt i32 %5, 5
br i1 %6, label %true6, label %false6
true6:
%7 = load i32, i32* %b
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
%9 = load i32, i32* %b
%10 = add i32 1, %9
store i32 %10, i32* %b
br label %target4
false6:
%11 = load i32, i32* %a
%12 = add i32 1, %11
store i32 %12, i32* %a
br label %target0
false2:
ret i32 0 }

