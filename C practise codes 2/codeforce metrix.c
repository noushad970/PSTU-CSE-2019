#include<stdio.h>
int main()
{
    int a[5][5];
    int i,j;
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
            scanf("%d",&a[i][j]);

            }
    for(i=0;i<5;i++)
    {
        for(j=0;j<5;j++)
        {
            if(a[i][j]==1)
            {
                if((i==0 || i==4)&&(j==0 || j==4))
                {
                    printf("4");
                }
                else if((i==1 || i==3) && (j==1 || j==3))
                    printf("3");
                else if(i==2 && j==2)
                    printf("0");
                else if((i==0 || i==4) && (j==1 || j==3))
                    printf("3");
                    else if((i==0 || i==4) && (j==2 || j==2))
                    printf("2");
                    else if((i==1 || i==3) && (j==2 ))
                    printf("1");
                    else if((i==2 ) && (j==1 || j==3 ))
                    printf("1");
        }
    }


    }
}



