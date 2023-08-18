#include<stdio.h>
#include<bits/stdc++.h>
int main()
{
    int n,m,a[100];
    scanf("%d %d",&m,&n);
    for(int i=0;i<n;i++)
    {

        scanf("%d",&a[i]);
    }
    sort(a.begin(),a.end());
    int dif=a[m-1]-a[0];
    printf("%d",dif);

}
