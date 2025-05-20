#include<stdio.h>
int main()
{
    int a[31];
    for(int i=0;i<31;i++)
    {
        scanf("%d",&a[i]);
    }
    int max=a[0];
    int min=a[0];
    for(int i=1;i<31;i++)
    {
        if(max<a[i])
            max=a[i];
        if(min>a[i]);
        min=a[i];
    }
    printf("The max temperature is %d\nThe minimum temperature is %d\n",max,min);
}
