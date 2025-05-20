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
    int sum=0;

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
           sum=sum+a[i][j];
           b[i][j]=a[i][j];
        }


    }
    printf("Sum of A matrix's all elements is: %d\n",sum);
    printf("Copy array is : \n");

    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
           printf("%d ",b[i][j]);
        }
        printf("\n");

    }
}
