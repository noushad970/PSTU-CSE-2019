
#include<stdio.h>
int main()
{
   char a[10000]
   ;
   gets(a);

    int x=strlen(a);
    for(int i=0;i<x;i++)
    {
        if(i=='W' && (i+1)=='U' && (i+2)=='B')
            printf(" ");
            printf("%c",a[i]);
    }

}


