#include<stdio.h>
int main()
{
    int m,n,i,j;
    printf("Enter raw: ");
    scanf("%d",&m);
    printf("Enter colum: ");
    scanf("%d",&n);
    int a[m][n];
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("Enter [%d][%d]:\n",i,j);
            scanf("%d ",&a[i][j]);
        }
    }
    printf("The original matrix is:\n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    printf("The transpose matrix is:\n");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            printf("%d ",a[j][i]);
        }
        printf("\n");
    }

}
