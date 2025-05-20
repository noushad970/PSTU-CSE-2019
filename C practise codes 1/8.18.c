#include<stdio.h>
int main()
{

    int n;
    printf("Enter the total amount: \n");
    scanf("%d",&n);

    int fh=n/500;
    int rfh=n%500;
    int h=rfh/100;
    int rh=rfh%100;
    int fif=rh/50;
    int rfif=rh%50;
    int tw=rfif/20;
    int rtw=rfif%20;
    int ten=rtw/10;
    int rten=rtw%10;
    int fiv=rten/5;
    int rfiv=rten%5;
    int two=rfiv/2;
    int one=rfiv%2;
    printf("Total five hundred tk's Notes are: %d\n",fh);
    printf("Total one hundred tk's Notes are: %d\n",h);
    printf("Total fifty tk's Notes are: %d\n",fif);
    printf("Total twenty tk's Notes are: %d\n",tw);
    printf("Total ten tk's Notes are: %d\n",ten);
    printf("Total five  tk's Notes are: %d\n",fiv);
    printf("Total two tk's Notes are: %d\n",two);
    printf("Total one tk Notes are: %d\n",one);
}
