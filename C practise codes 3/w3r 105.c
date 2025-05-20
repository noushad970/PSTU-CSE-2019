#include<stdio.h>
int main()
{
    int i,s=0,p=0,sum=0,sum2=0;
    float a[7];

    for(i=0;i<7;i++)
    {
    printf("Enter the %dth number: ",i+1);
    scanf("%f",&a[i]);
    }
    for(i=0;i<7;i++)
    {
        if(a[i]>0)
        {
            s++;
            sum=sum+a[i];

        }
        else if(a[i]<0)
        {
            p++;
            sum2=sum2+a[i];
        }

    }
    float avg1,avg2;
    avg1=sum/s;
    avg2=sum2/p;
    printf("The average of positive numbers are: %0.2f\n",avg1);
    printf("The average of Negative numbers are: %0.2\n",avg2);


}
