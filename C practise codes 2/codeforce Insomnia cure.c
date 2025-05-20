#include<stdio.h>
int main()
{
    int k,k1[100000],l,l1[100000],m,m1[100000],n,n1[100000],d;
    scanf("%d %d %d %d %d",&k,&l,&m,&n,&d);
    int z=0;

    for(int i=1;i<=d;i++)
    {
        if(i%k==0 || i%l==0 || i%m==0 || i%n==0)
            z++;
    }

printf("%d",z);
}
