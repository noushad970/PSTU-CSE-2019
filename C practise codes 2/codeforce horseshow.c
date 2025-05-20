#include<stdio.h>
int main()
{
    int i,a[15],j,n=0;
    for(i=0;i<4;i++)
    {
        scanf("%d",&a[i]);

    }
    for(i=0;i<4;i++)
    {
        j=i+1;
        for(;j<4;j++)
        {
           if(a[i]==a[j])
                n++;

        }
        if(a[0]==a[1] && a[0]==a[2] && a[0]==a[3])
            break;
        else if((i==1)&&(a[1]==a[2] && a[1]==a[3]))
                break;
        else if((i==0)&&(a[0]==a[1] && a[0]==a[2]))
                break;
        else if((i==2)&&(a[3]==a[2] && a[2]==a[0]))
        {n=n-1;
                break;
        }
        else if((i==3)&&(a[3]==a[1] && a[3]==a[0]))
        {n=n-1;
                break;
        }
    }
    printf("%d",n);

}
