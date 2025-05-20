#include<stdio.h>
int main()
{
    char a[100],b[100];
    printf("Enter your text:");
    gets(a);
    strcpy(b,a);
    printf("The copied string is:\n");
    printf("%s",b);

}
