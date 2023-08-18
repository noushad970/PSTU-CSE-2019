
#include<stdio.h>
int main()
{
    int n;
    int sum;
    scanf("%d",&n);
    int rm1=n/100;
    int rk1=n%100;
    int rm2=rk1/20;
    int rk2=rk1%20;
    int rm3=rk2/10;
    int rk3=rk2%10;
    int rm4=rk3/5;
    int rk4=rk3%5;
    int rm5=rk4/1;
    sum=rm1+rm2+rm3+rm4+rm5;
    printf("%d",sum);
}
