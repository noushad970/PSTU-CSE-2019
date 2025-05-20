#include<stdio.h>
#include<string.h>
int main()
{
    char *a[100];
 printf("Enter first string:\n");
    gets(a);
    char *b[100];
    printf("Enter the word where the string will continue from:\n");
    gets(b);
    char *x=strstr(a,b);
    printf("The output is:\n");
    printf("%s",x);
}
