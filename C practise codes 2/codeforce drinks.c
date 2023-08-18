#include<stdio.h>
int main()
{
    float sum=0;
    double avg;
    int n,a[100],i;
    scanf("%d",&n);

    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        sum=sum+a[i];
    }

    avg=sum/n;
    printf("%0.12lf",avg);
}
