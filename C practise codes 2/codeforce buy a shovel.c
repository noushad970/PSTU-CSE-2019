#include<stdio.h>
int main()
{
    int k,r,i=1;
    scanf("%d %d",&k,&r);
    int x=k;
    for(i=1;i<=1000;i++)
    {

        k=x*i;

        if(k%10==r || k%10==0)
        {
            break;
        }

    }
    printf("%d",i);
}
