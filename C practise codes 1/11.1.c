#include<stdio.h>
struct time_struct{
int hour;
int minute;
int second;
};
int main()
{
    struct time_struct time;
    printf("Enter the time in hour: \n");
    scanf("%d",&time.hour);
    printf("Enter the time in minute: \n");
    scanf("%d",&time.minute);
    printf("Enter the time in second: \n");
    scanf("%d",&time.second);
    printf("the time is :\n");
    printf("%d:%d:%d\n",time.hour,time.minute,time.second);
}

