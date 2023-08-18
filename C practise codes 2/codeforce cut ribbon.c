#include<stdio.h>
int main()
{
    int m,a[3];
    int z=0,x=0;
    scanf("%d %d %d %d",&m,&a[0],&a[1],&a[2]);
    for(int i=0;i<3;i++)
    {
        if(a[i]==m && a[i]>=a[i+1]&&a[i]>=a[i+2])
        {
            z++;
            break;
        }

        else if(m>a[i])
        {
            z++;

            x=x+a[i];
            if(x>=m)
                break;
        }

    }
    printf("%d",z);
}
