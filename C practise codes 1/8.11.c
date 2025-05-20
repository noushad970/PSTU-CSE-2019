#include<stdio.h>
int main()
{
    char a[100];
    gets(a);
    int x=strlen(a);
    printf("The string length is : %d",x);

}
