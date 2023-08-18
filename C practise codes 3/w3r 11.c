#include<stdio.h>
int main()
{
    float i1,ti1,i2,ti2,avg;
    printf("Enter 1st item weight : ");
    scanf("%f",&i1);
    printf("Number of 1st item: ");
    scanf("%f",&ti1);
    printf("Enter 2nd item weight : ");
    scanf("%f",&i2);
    printf("Number of 2nd item: ");
    scanf("%f",&ti2);
    avg=(i1*ti1 + i2*ti2)/(ti1+ti2);
    printf("The average is: %0.2f",avg);


}
