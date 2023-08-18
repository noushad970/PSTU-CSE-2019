#include<stdio.h>
int main()
{
    int m,d,y;
    printf("Enter your birthday month\n");
    scanf("%d",&m);
    printf("Enter your birthday date\n");
    scanf("%d",&d);
    printf("Enter your birthday year\n");
    scanf("%d",&y);
    printf("Your birthday is:\n");
    printf("%d-%d-%d",d,m,y);
}
