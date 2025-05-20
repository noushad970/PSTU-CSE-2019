#include<stdio.h>
int main()
{
    int sum=0,n=100;
    for(int n=0;n<=100;n++)
    {
        if(n%6==0&&n%4!=0)
        {printf("%d\n",n);
    sum=sum+n;
    }
    }
printf("Sum is: %d",sum)

;}
