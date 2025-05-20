#include<stdio.h>
int main()
{
    int k,i;
     int n[100000];
     double array[10000];
   int t;
   // long long int a[100000000];
    scanf("%d",&t);

    for(i=0;i<t;i++)
    {
        scanf("%d",&n[i]);

    }
        for(i=0;i<t;i++)
    {
        array[i]=((n[i]+1)*(n[i]+1)+1);
        printf("%lf\n",array[i]);
    }
    }
