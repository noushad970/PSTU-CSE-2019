#include<stdio.h>
int main()
{
    int i,x=0,n,s,j;
    printf("Enter The range of the prime numbers you want to find: ");
    scanf("%d",&n);
    printf("the prime numbers from 1 to %d are:\n",n);
    for(i=2; i<=n; i++)
    {
        s=0;
        for(j=2; j<i; j++)
        {
            if(i%j==0)
            {
                s++;
                break;
            }
        }
        if(s==0)
        {
            printf("%d\n",i);
            x++;
        }

    }

    printf("Total prime numbers are %d",x);

}
