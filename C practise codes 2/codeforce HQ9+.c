#include<stdio.h>
int main()
{
     char p[100];

    int i,x=0,h=0;
        gets(p);
        for(i=0;i<strlen(p);i++)
        {
            if(p[i]>33 && p[i]<126)
            {
            if(p[i]=='H' || p[i]=='Q' || p[i]=='9' || p[i]=='+')
            h=1;
            }


        }

        if(h)
        printf("YES");
        else
        printf("NO");



}
