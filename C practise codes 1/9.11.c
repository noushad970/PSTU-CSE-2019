#include<stdio.h>
int main()
{
    char a[100],b[100];
    int d;
    printf("Enter string A: ");
    gets(a);
    printf("Enter string B: ");
    gets(b);
    d=strcmp(a,b);
    if(d==0)
    {
        printf("String are equal");
    }
    else if(d==0)
        printf("Words A and B are same.");

    else
        printf("Words A and B are not same");
    return 0;
}

