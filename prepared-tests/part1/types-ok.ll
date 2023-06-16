@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%a = alloca i32
store i32 5, i32* %a
%b = alloca double
store double 4.5, double* %b
%1 = load double, double* %b
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpr, i64 0, i64 0), double %1)
ret i32 0 }

