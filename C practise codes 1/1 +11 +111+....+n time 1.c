#include<stdio.h>
int main()
{
    int n,sum=0;
    printf("Enter range: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        sum=sum+(pow(10,i));
        printf("%d\n",sum);
    }
}
