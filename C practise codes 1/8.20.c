#include<stdio.h>
int main()
{
    int n1,n2,a[100][100],i,j,n3,n4,i1,j1,b[100][100],i2,j2,c[100][100];
    printf("Enter raw number: ");
    scanf("%d",&n1);
    printf("Enter colom number: ");
    scanf("%d",&n2);
    printf("Matrix A: \n");


    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            scanf("%d",&a[i][j]);
        }

    }
    printf("MATRIX A = \n");
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            printf("A[%d][%d] = %d  ",i,j,a[i][j]);
        }
        printf("\n");
    }
    //end of matrix a
    printf("Matrix B: \n");



    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            scanf("%d",&b[i][j]);
        }

    }
    printf("MATRIX B = \n");
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
            printf("B[%d][%d] = %d  ",i,j,b[i][j]);
        }
        printf("\n");
    }
    printf("Matrix A + Matrix B =\n");
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
           c[i][j]=a[i][j]+b[i][j];
           printf("%d  ",c[i][j]);
        }
        printf("\n");
    }
    printf("Matrix A - Matrix B =\n");
    for(i=0;i<n1;i++)
    {
        for(j=0;j<n2;j++)
        {
           c[i][j]=a[i][j]-b[i][j];
           printf("%d  ",c[i][j]);
        }
        printf("\n");
    }
}


