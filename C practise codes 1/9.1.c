#include<stdio.h>
int main()
{
    char name[10];
    printf("Enter your name:\n");
    gets(name);
    int i=0;
    //printf("%d",name[0]);
    printf("The ASCII value of this name is: \n");
    for(int i=0;i<10;i++)
    {

        if(name[i]=='\0')
            break;printf("%c = %d ",name[i],name[i]);

    }

}
