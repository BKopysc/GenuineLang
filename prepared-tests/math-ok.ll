@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%1 = add i32 10, 25
%2 = add i32 %1, 5
%a = alloca i32
store i32 %2, i32* %a
%3 = mul i32 18, 2
%b = alloca i32
store i32 %3, i32* %b
%4 = load i32, i32* %a
%5 = load i32, i32* %b
%6 = mul i32 %5, %4
%c = alloca i32
store i32 %6, i32* %c
%7 = load i32, i32* %c
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
ret i32 0 }

