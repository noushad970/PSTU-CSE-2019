#include<stdio.h>
int main()
{
    int i,j,n,m;
    scanf("%d %d",&n,&m);
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            if(i%2==0)
                printf("#");
            else if(i%2==1)
            {
                if((i==1 ||i==5 || i==9 || i==13 || i==17 ||i==21 ||i==25 ||i==29 || i==33 || i==37 || i==41 ||i==45 ||i==49)&&(j==m-1))
                printf("#");
                else if((i==1 ||i==5 || i==9 || i==13 || i==17 ||i==21 ||i==25 ||i==29 || i==33 || i==37 || i==41 ||i==45 ||i==49))
                printf(".");
                else
                { if(j==0)
                printf("#");
                else
                    printf(".");

                }

            }
        }
        printf("\n");

    }
}
