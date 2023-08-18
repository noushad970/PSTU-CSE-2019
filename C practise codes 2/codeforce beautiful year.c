#include<stdio.h>
int main()
{
    int n;
    int a[4];
    scanf("%d",&n);
    while(n!=0)
            {
                for(int i=0;i<4;i++)
                {
                    a[i]=n%10;

                }
                n=n/10;

            }

}

