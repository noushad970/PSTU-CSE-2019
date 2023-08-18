#include<stdio.h>
int main()
{
    int a[100][100],b[100][100];
    int c,r,i,j;
    printf("Enter Raw:");
    scanf("%d",&r);
    printf("Enter Columb:");
    scanf("%d",&c);

        printf("Enter A:\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("A[%d][%d]=",i,j);
            scanf("%d",&a[i][j]);
        }

    }
    printf("\nEnter B:\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("B[%d][%d]=",i,j);
            scanf("%d",&b[i][j]);
        }

    }
    printf("\nThe sum of the matrix is:\n");
    for(i=0;i<r;i++)
    {
        for(j=0;j<c;j++)
        {
            printf("%d ",(a[i][j] + b[i][j]));
        }
        printf("\n");
    }

}

