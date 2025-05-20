#include<stdio.h>

int main()
{
    char a[100];
    printf("Enter the string: ");
    gets(a);
    char x;
    printf("Enter the specified alphabhate: ");
    scanf("%c",&x);
    int d=0;
    for(int i=0;i<strlen(a);i++)
    {
        if(a[i]==x)
            d++;
    }
    printf("'%c' is presented for %d time in the string: ",x,d);

}
