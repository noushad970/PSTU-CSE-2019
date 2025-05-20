#include<stdio.h>
int main()
{
    int n,a[100],i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        int min=i;
        for(j=i+1;j<n;j++)
        {
           if(a[j]<a[min])
            min=j;
        }
        int temp;
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
        printf("%d ",a[i]);




    }
}
