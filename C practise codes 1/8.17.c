#include<stdio.h>
int main()
{
    int m,n;
    printf("Enter raw: ");
    scanf("%d",&m);
    printf("Enter colum: ");
    scanf("%d",&n);
    int a[m][n];
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
    printf("The odd elements are: \n");
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(a[i][j]%2==1)
                {printf("%d ",a[i][j]);
                sum=sum+a[i][j];}
        }
    }
    printf("\nThe sum of odd elements are: %d\n",sum);


}

