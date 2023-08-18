#include<stdio.h>
int main()
{
    int t;
    scanf("%d",&t);
    int a[t];
    int b[10000];
    for(int i=0;i<t;i++)
    {
        scanf("%d",&a[i]);
        for(int j=0;j<a[i];j++)
        {
            scanf("%d",&b[j]);
        }
    }
}
