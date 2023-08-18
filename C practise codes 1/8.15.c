#include<stdio.h>
int main()
{
    int m,n,i,j;
    printf("Enter raw: ");
    scanf("%d",&m);
    printf("Enter colum: ");
    scanf("%d",&n);
    int a[m][n],b[m][n];
    printf("Enter Metrix A:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("Enter [%d][%d]:\n",i,j);
            scanf("%d",&a[i][j]);
        }
    }
    printf("Enter Metrix B:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("Enter [%d][%d]:\n",i,j);
            scanf("%d",&b[i][j]);
        }
    }
    printf("A matrix is:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("B matrix is:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",b[i][j]);
        }
        printf("\n");
    }
    printf("A + B is :\n");

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]+b[i][j]);
        }
        printf("\n");
    }
    printf("A - B is :\n");

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]-b[i][j]);
        }
        printf("\n");
    }
}
