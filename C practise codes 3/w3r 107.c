#include<stdio.h>
int main()
{
    int n;
    printf("Enter an integer: ");
    scanf("%d",&n);
    int i,j;
    if(n%2==0)
    {
        printf("The next 10 Even numbers are: \n");
        for(i=n+2;i<=n+20;i=i+2)
        {
            printf("%d\n",i);
        }
        printf("The next 10 odd numbers are: \n");

        for(i=n+1;i<=n+19;i=i+2)
        {
            printf("%d\n",i);
        }
    }
    else if(n%2==1)
    {

        printf("The next 10 even numbers are: \n");

        for(i=n+1;i<=n+19;i=i+2)
        {
            printf("%d\n",i);
        }
        printf("The next 10 odd numbers are: \n");
        for(i=n+2;i<=n+20;i=i+2)
        {
            printf("%d\n",i);
        }
    }
}
