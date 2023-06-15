@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%a = alloca i32
store i32 3, i32* %a
%1 = load i32, i32* %a
%2 = icmp eq i32 %1, 2
br i1 %2, label %true2, label %false2
true2:
%z = alloca i32
store i32 5, i32* %z
br label %false2
false2:
%3 = load i32, i32* %z
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
ret i32 0 }


