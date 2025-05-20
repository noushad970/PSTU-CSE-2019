#include<stdio.h>
int main()
{
    int r,c,x=1,i,j;
    printf("Enter raw \n");
    scanf("%d",&r);
    for(i=0;i<r;i++)
    {
        for(j=1;j<r-i;j++)
            printf(" ");
        for(j=0;j<=i;j++)
            printf("* ");
        printf("\n");
    }
    for(i=r;i>0;i--)
    {
        for(j=0;j<r-i;j++)
            printf(" ");
            for(j=0;j<i;j++)
                printf("* ");
        printf("\n");
    }
}
