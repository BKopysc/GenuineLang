@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)

define i32 @main() nounwind{
%a = alloca i32
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @strscani, i32 0, i32 0), i32* %a)
%ok = alloca i32
store i32 0, i32* %ok
%fal = alloca i32
store i32 1, i32* %fal
%2 = load i32, i32* %a
%3 = icmp eq i32 %2, 5
br i1 %3, label %true3, label %false3
true3:
%4 = load i32, i32* %ok
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
br label %extra3
false3:
%6 = load i32, i32* %fal
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %6)
br label %extra3
extra3:
ret i32 0 }


