#include<stdio.h>
int main()
{
    int a[100];
    int n,e=0,o=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]%2==0)
            e++;
        else if(a[i]%2==1)
            o++;

    }
    int x;
    if(e>o)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==1)
               {x=i+1;
        }}

    }
    if(e<o)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
               {x=i+1;
        }}

    }
    printf("%d",x);
}
