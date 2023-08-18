#include<stdio.h>
int main()
{//tu=total unit;b=bill;
    float tu,b,tm;
    printf("Enter your use of electricity in unit: ");
    scanf("%f",&tu);
    if(tu>=0 && tu<=200)
    {
        b=tu*0.8;
    tm=b+100;
    }
    else if(tu>200&&tu<=100)
    {

        b=160+(tu-200)*0.9;
    tm=b+100;
    }

    else if(tu>300)
    {
        b=(160+90+(tu-300)*1);
        tm=b+b*0.15+100;
    }

printf("The total bill is : %0.2f",tm);

}
