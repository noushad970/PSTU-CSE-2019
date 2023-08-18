#include<stdio.h>
int main()
{
    int i,condition=1,x;
    char s[100];
    gets(s);
    x=strlen(s);


    for(i=1;i<x;i++)
    {
        if(s[i]==s[i-1]){
            condition++;
           if(condition==7)
        {printf("YES");
        return 0;
        }
        }
        else
            condition=1;

    }
    printf("NO");

}
