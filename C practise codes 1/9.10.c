#include<stdio.h>
int main()
{
    int n;
    printf("Enter number of students:\n");
    scanf("%d",&n);
    int roll;
    char name[100];
    int om;//om=obtained marks;

    for(int i=1;i<=n;i++)
    {
        printf("Enter %dth students name:\n",i);
        scanf("%s",name);
        printf("Enter %dth students Roll number:\n",i);
        scanf("%d",&roll);
        printf("Enter %dth students Obtained marks:\n",i);
        scanf("%d",&om);
        printf("Name\t Roll\t     Obtained marks:\n");
         printf("%s\t %d\t %d\n",name,roll,om);
    }

}
