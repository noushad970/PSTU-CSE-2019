#include<stdio.h>
int main()
{
    long long int n,i,k,a[1000000000],b[1000000000];
    scanf("%lld",&n);
    for(i=0;i<n;i++)
     {
        scanf("%lld",&a[i]);
        scanf("%lld",&b[i]);
    }
    for(i=0;i<n;i++)
    {
        k=0;
      while(a[i]%b[i]!=0)
      {
          k++;
          a[i]++;
      }
      printf("%lld\n",k);
    }

}
