#include<stdio.h>
int main()
{
    int n,i;
    printf("Enter a value between 1 to 100: ");
    scanf("%d",&n);
    printf("The value's which has reminder 3 are:\n");
    for(i=1;i<=100;i++)
    {
        if(i%n==3)
        {
            printf("%d\n",i);
        }
    }

}
