
#include<stdio.h>
int main()
{
    int n,x=0;
    char a[200];
    gets(a);
    n=strlen(a);
    for(int i=0;i<n;i++)
    {
        if(a[i]=='.')
            printf("0");
        else if(a[i]=='-' && a[i+1]=='.')
            {printf("1");
            i++;
            }
        else if(a[i]=='-' && a[i+1]=='-')
        {printf("2");
        i++;
        }


    }

}
