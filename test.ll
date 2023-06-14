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
%2 = icmp ne i32 %1, 5
br i1 %2, label %true2, label %false2
true2:
%3 = load i32, i32* %a
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
%5 = load i32, i32* %a
%6 = sub i32 %5, 1
store i32 %6, i32* %a
br label %target0
false2:
ret i32 0 }

