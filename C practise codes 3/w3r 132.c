#include<stdio.h>
int main()
{
    int a[8];
    int i;
    for(i=0;i<8;i++)
    {
        printf("Enter %dth building height: ",i+1);
        scanf("%d",&a[i]);
    }
    int max,max2,max3;
    max=a[0];
    for(i=0;i<8;i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    max2=a[0];
    for(i=0;i<8;i++)
    {
        if(a[i]>max2 && a[i]<max)
            max2=a[i];
    }
    max3=a[0];
    for(i=0;i<8;i++)
    {
        if(a[i]>max3 && a[i]<max && a[i]<max2)
            max3=a[i];

    }
    printf("The top three bulding with height are: \n%d\n%d\n%d",max,max2,max3);
}
