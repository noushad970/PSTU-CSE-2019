#include<stdio.h>
int main()
{
    int a[9];

    for(int i=0;i<9;i++)
    {
        printf("Enter a digit: \n");
        scanf("%d",&a[i]);
    }
    int sum=0;
    for(int i=0;i<9;i++)
    {
        sum=sum+(a[i]*(i+1));
    }
    if(sum%11==0)
        printf("This is a valid ISBN code.\n");
    else
        printf("This is not a valid ISBN code.");
}
