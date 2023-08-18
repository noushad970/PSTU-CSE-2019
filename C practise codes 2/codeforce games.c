#include<stdio.h>
int main()
{
    int n,a[30],b[30];
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d %d",&a[i],&b[i]);

    }
    int x=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i]==b[j])
                x++;
        }
    }
    printf("%d",x);
}

