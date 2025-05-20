#include<stdio.h>
int main()
{
    float AB,AC,BC;
    printf("Enter triangle's base: ");
    scanf("%f",&AB);
    printf("Enter triangle's height: ");
    scanf("%f",&AC);
    printf("Enter triangle's hyperbola: ");
    scanf("%f",&BC);
    float x,y,z;
    x=AB*AB;
    y=AC*AC;
    z=BC*BC;
    if(x+y==z)
        printf("The triangle is a right angle triangle.");
    else
        printf("Not a right angle triangle.");
    //hyperbola
}
