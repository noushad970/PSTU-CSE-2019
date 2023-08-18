#include<stdio.h>
int main()
{
    float x,a,b,c,x1,x2,d;
    printf("Enter a: ");

    scanf("%f",&a);
    printf("Enter b: ");
    scanf("%f",&b);
    printf("Enter c: ");
    scanf("%f",&c);
    d=sqrt(b*b-4*a*c);
    x1=(-b+d)/(2*a);
    x2=(-b-d)/(2*a);
    if(a==0 && b==0)
        printf("No solution");
    else if(a==0)
    {
        x=(-c/b);
        printf("X = %0.3f",x);
    }
    else if((b*b-4*a*c)<0)
        printf("There is no real root.");
    else
        {
        printf("The value of x1 is = %0.3f\n",x1);
        printf("The value of x2 is = %0.3f",x2);

        }

}
