#include<stdio.h>
int main()
{
    int height;
    int width;
    int perimeter;
    int area;
    height=7;
    width=5;
    perimeter=2*(height+width);
    area=(height*width)/2;
        printf("Perimeter of the rectangle is %d inches\n",perimeter);
        printf("Area of the rectangle is %d inches\n",area);
    return 0;
}
