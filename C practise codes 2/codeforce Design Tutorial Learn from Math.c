#include<stdio.h>
int main()
{
    int n,max=0;
    long long int x[100000];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {

        scanf("%lld",&x[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(x[i]>max)
            max=x[i];
    }
    int sum=0;
    for(int i=0;i<n;i++)
    {
        sum=sum+(max-x[i]);
    }
    printf("%d",sum);

}
