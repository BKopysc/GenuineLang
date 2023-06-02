@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
define i32 @main() nounwind{
%b = alloca double
%a = alloca double
%1 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strscanr, i64 0, i64 0), double* %b)
%2 = call i32 (i8*, ...) @__isoc99_scanf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strscanr, i64 0, i64 0), double* %a)
%3 = load double, double* %a
%4 = load double, double* %b
%5 = fadd double %4, %3
%c = alloca double
store double %5, double* %c
%6 = load double, double* %c
%7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpr, i64 0, i64 0), double %6)
ret i32 0 }

