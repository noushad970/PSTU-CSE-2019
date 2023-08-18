#include<stdio.h>
int main()
{
    int a[8],i;
    for(i=0;i<8;i++)
    {
        printf("Enter %dth number: ",i+1);
        scanf("%d",&a[i]);
    }
    printf("The outputs are: \n");
    for(i=0;i<8;i++)
    {
        printf("%d\n",a[i]);
    }
    int temp1=a[0];
    a[0]=a[7];
    a[7]=temp1;
    int temp2=a[1];
    a[1]=a[6];
    a[6]=temp2;
    printf("The changed outputs are: \n");
    for(i=0;i<8;i++)
    {
        printf("%d\n",a[i]);
    }
}
