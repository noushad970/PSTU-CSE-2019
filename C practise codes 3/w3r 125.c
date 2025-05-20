#include<stdio.h>
int main()
{
    int n,i,a[7];
    printf("Enter a number: ");
    scanf("%d",&n);

    //printf("%d\n",a[0]);
    for(i=0;i<7;i++)
    {
        printf("Name_Array[%d] = %d\n",i,n);
        n=n*2;
    }
}
