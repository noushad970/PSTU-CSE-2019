
#include<stdio.h>
int main()
{
    int n,m,a,b;
    int money;
    scanf("%d %d %d %d",&n,&m,&a,&b);
     float x=float(b)/float(m);
     if(x < float(a))
     {
         money=((n/m)*b+(n%m)*a);
     }
     else
        (
         money=n*a;
         )
         printf("%d",money);

}
