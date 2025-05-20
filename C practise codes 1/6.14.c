#include<stdio.h>
int main()
{
    int count=0,n;
    printf("Enter a positive number: ");
    scanf("%d",&n);
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            count++;


            }

    }
                if(count>0)
                    printf("Not a prime number\n");
                else
                    printf("This is prime number\n");





}

