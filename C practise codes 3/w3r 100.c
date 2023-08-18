#include<stdio.h>
int main()
{
    int m;
    float x;
    printf("Enter the ammount of money: ");
    scanf("%d",&m);
    x=(float)m-m;
    int h = (int)m/100;
    int rh=(int)m%100;
    int f= rh/50;
    int rf= rh%50;
    int fiv= rf/5;
    int o=rf%5;
    int fp=x/.5;
    printf("100$ = %d\n",h);
    printf("50$ = %d\n",f);
    printf("5$ = %d\n",fiv);
    printf("1$ = %d\n",o);
    printf("50C = %d\n",fp);
}
