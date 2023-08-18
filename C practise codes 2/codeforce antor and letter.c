#include<stdio.h>
int main()
{
    char s[1000];
    gets(s);
    int x= strlen(s);
    for(int i=1;i<x-1;x++)
    {
        for(int j=i+1;j<x-1;j++)
        {
            if(int(s[i])> 65 && int(s[i])< 91 && int(s[i])> 97 && int(s[i])< 123)
            {

            }
        }

    }
}
