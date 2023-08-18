#include<stdio.h>
int main()
{
   long long int n,i,j,k=0,a[10000][100000],b[10000][100000];

    scanf("%lld",&n);
    for(i=0;i<n;i++)
     {
         for(j=0;j<n;j++)
        {scanf("%lld",&a[i][j]);
        scanf("%lld",&b[i][j]);
    }
    }
    for(i=0;i<n;i++)
    {

      for(j=0;j<n;j++)

      {while(a[i][j]%b[i][j]!=0)
      {
          k++;
          a[i][j]++;
      }
      }
      printf("%lld\n",k);
    }


}
