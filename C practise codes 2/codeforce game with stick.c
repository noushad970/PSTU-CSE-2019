#include<stdio.h>
int main()
{

        int t,n[10000],a[10000];
        scanf("%d",&t);
        for(int i=0;i<t;i++)
        {
            scanf("%d",&n[i]);
            for(int j=0;j<n[i];j++)
            {
                scanf("%d",&a[j]);
            }
        }
            int x;
        for(int i=0;i<t;i++)
        {
            x=1;
            for(int j=1;j<n[i];j++)
            {
                if(a[j]-a[j-1]==1 || a[j]-a[j-1]==0)
                {
                  x++;
                }
                //printf("%d\n",x);
            }
            if(x==n[i])
                printf("YES\n");
            else
                printf("NO\n");
        }


}
