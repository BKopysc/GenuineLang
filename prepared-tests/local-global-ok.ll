@strpi = constant [4 x i8] c"%d\0A\00"
@strpr = constant [4 x i8] c"%f\0A\00"
@strscani = constant [3 x i8] c"%d\00"
@strscanr = constant [4 x i8] c"%lf\00"
declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)

define i32 @main() nounwind{
%a = alloca i32
store i32 2, i32* %a
%1 = call i32 @printer()
%2 = load i32, i32* %a
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
ret i32 0 }

define i32 @printer() { 
%a = alloca i32
store i32 10, i32* %a
%1 = load i32, i32* %a
%2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %1)
ret i32 0
}


