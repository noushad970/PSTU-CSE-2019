#include<stdio.h>
int main()
{
    int max=0;
    int x[5],a,b,c;
    scanf("%d %d %d",&a,&b,&c);
    x[0]=a+b*c;
    x[1]=a*(b+c);
    x[2]=a*b*c;
    x[3]=(a+b)*c;
    x[4]=a+b+c;
    for(int i=0;i<5;i++)
    {
        if(x[i]>max)
            max=x[i];
    }

    printf("%d",max);
}
