#include <stdio.h>

int test(int a, int b){
    return 5;
}

int main(){
    int a = 4;
    int b = 3;
    int c = test(a,b);
    printf("%d\n",c);
}