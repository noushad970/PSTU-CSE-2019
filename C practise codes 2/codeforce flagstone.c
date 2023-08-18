#include<stdio.h>
int main()
{
    int m,n,a,x,y;
    scanf("%d %d %d",&m,&n,&a);
    x=m/a;
    y=n/a;
    if(m%a>0)
        x++;
    if(n%a>0)
        y++;
    int tot=x+y;
    if(m==1 && n==1 && a==1)
        tot=1;
    printf("%d",tot);

}
