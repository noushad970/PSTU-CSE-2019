#include<stdio.h>
int main()
{

    float ipd;
    int id;
    printf("Enter id: ");
    scanf("%d",&id);
    printf("Enter salary ammount per Day: ");
    scanf("%f",&ipd);
    float sal= 30*ipd;
    printf("ID: %d\n",id);
    printf("Monthly salary: %0.2f$\n",sal);
}
