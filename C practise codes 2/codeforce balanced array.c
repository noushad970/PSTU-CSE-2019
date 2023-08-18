#include<stdio.h>
int main()
{
    int n,a[100000],i,j;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        if(a[i]>2 && a[i]%2==0 && (a[i]/2)%2==0)
        {
            printf("YES\n");
            int sum1=0,sum2=0;
            for(j=2;j<=a[i];j=j+2)
            {
                printf("%d ",j);
                sum1=sum1+j;
            }
            for(j=1;j<a[i];j=j+2)
                {
                    sum2=sum2+j;
                }
                int sum=sum1-sum2;
                for(j=1;j<a[i];j=j+2)
                {

                    if(j==a[i]-1)
                        printf("%d",j+sum);
                    else
                    printf("%d ",j);

                }
        }
        else
            printf("NO");
        printf("\n");
    }
}
