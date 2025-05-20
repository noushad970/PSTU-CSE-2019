#include<stdio.h>
int main()
{
    int s,n;
    int ds[10000],hs[10000];
    int x=0,y=0;
    //n=number of dragon/level s= strenght
    scanf("%d %d",&s,&n);
    for(int i=0;i<n;i++)
    {
      scanf("%d",&ds[i]);
      scanf("%d",&hs[i]);
    }
    for(int i=0;i<n;i++)
    {
     if(s>=ds[i])
      x++;
      s=s+hs[i];
      y=y+ds[i];
    }
    if(n==x)
        printf("YES");

    else
        printf("NO");


}
