#include<stdio.h>
int main()
{
    int n,a[100000];
    int x=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {

        scanf("%d",&a[i]);

    }
    for(int i=0;i<n;i++)
    {
        if(a[i]!=a[i+1])
            {
                x++;
            }
    }
    printf("%d",x);

}
